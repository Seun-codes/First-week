package org.example.FileReader;

import org.example.model.Product;
import org.example.model.Store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;

public class File {
    private BufferedReader bufferedReader;
    private String line;
    Store store;
    Product products = null;

    public File(String path) {
        try {
            this.bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        this.line = "";
    }

    public String readProductFile(Product product, Store store) {
        String message = " ";
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                int productIndex = store.findProduct(values[1]);

                if (store.findProduct(values[1]) >= 0) {
                    Product productInStore = store.getProductList().get(productIndex);
                    productInStore.setQuantity(productInStore.getQuantity() + Integer.parseInt(values[2]));
                    message = "Successful";

                } else {
                    String name = values[1];
                    String category = values[0];
                    int quantity = Integer.parseInt(values[2]);
                    double price = Double.parseDouble(values[3]);

                    products = new Product(category, name, quantity,price);
                    store.getProductList().add(products);
                    message = "Products added";
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return message;


    }

}
