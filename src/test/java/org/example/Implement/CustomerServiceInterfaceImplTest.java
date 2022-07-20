package org.example.Implement;

import org.example.Enums.Role;
import org.example.FileReader.File;
import org.example.model.Product;
import org.example.model.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceInterfaceImplTest  {
    CustomerServiceInterfaceImpl customer = new CustomerServiceInterfaceImpl("dupe");
    Store store = new Store("main",Role.MANAGER);
    private List<Product> productList = new ArrayList<>();
    Product products = new Product("Cookies","oatMeal Raisin",6,3.0);
    List <Product> customerCart = new ArrayList<>();

    @BeforeEach
    void setUp() {
        store.getProductList().add(products);
        // store = new Store("store", Role.MANAGER);
         //products = new Product();
       // List<Product> productList = new ArrayList<>();
         //customer = new CustomerServiceInterfaceImpl("bola");
//        String[] values;
//
//        String path = "src/main/java/productDetails.csv";
//
//        try {
//            BufferedReader productDetails = new BufferedReader(new FileReader(path));
//            String line;
//
//            while ((line = productDetails.readLine()) != null) {
//                values = line.split(",");
//                int productIndex = store.findProduct(values[1]);
//
//                if (store.findProduct(values[1]) >= 0) {
//                    Product productInStore = store.getProductList().get(productIndex);
//                    productInStore.setQuantity(productInStore.getQuantity() + Integer.parseInt(values[2]));
//
//                } else {
//                    String name = values[1];
//                    String category = values[0];
//                    int quantity = Integer.parseInt(values[2]);
//                    double price = Double.parseDouble(values[3]);
//                   products = new Product(category, name, quantity, price);
 //                   store.getProductList().add(products);
//                }
//
//
//                //System.out.println(products);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }



    @Test
    void buy() {

        int actual = customer.buy(customer,"Oatmeal Raisin","Cookies",4,store);
        assertEquals(0,actual);
    }
}