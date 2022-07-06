package org.example;

import org.example.Enums.ApplicantE;
import org.example.Enums.Role;
import org.example.Implement.CashierServiceImpl;
import org.example.Implement.CustomerServiceInterfaceImpl;
import org.example.Implement.ManagerServiceInterfaceImpl;
import org.example.model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("store",Role.MANAGER);
        Product products = null;
        List<Product> productList = new ArrayList<>();
        String [] values;

        String path = "src/main/java/productDetails.csv";

        try {
            BufferedReader productDetails = new BufferedReader(new FileReader(path));
            String line;

            while ((line = productDetails.readLine()) != null) {
                values = line.split(",");
                int productIndex = store.findProduct(values[1]);

                if(store.findProduct(values[1]) >= 0){
                    Product productInStore = store.getProductList().get(productIndex);
                    productInStore.setQuantity(productInStore.getQuantity() + Integer.parseInt(values[2]));

                } else {
                    String name = values[1];
                    String category = values[0];
                    int quantity= Integer.parseInt(values[2]);
                    double price = Double.parseDouble(values[3]);
                    products = new Product(category,name,quantity,price);
                    store.getProductList().add(products);
                }



                //System.out.println(products);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(Product prod : store.getProductList()){
            System.out.println(prod.getName() + " " + prod.getQuantity());
        }

        List<Product> Lizzy = new ArrayList<>();

        ManagerServiceInterfaceImpl managerService = new ManagerServiceInterfaceImpl();


     CustomerServiceInterfaceImpl customer = new CustomerServiceInterfaceImpl("bola");


       
        customer.buy("Oatmeal Raisin","Cookies",products,6,store);
        customer.buy("Arrowroot","bars",products,45, store);
        customer.buy("Arrowroot","Cookies",products,45, store);

        CashierServiceImpl cashier = new CashierServiceImpl("TLA", 334);
        cashier.sell(customer, customer.getCustomerCart());




        Staff manager = new Staff("Temi", 123, Role.MANAGER );

        managerService.saveStaff(store, manager);

        Applicant applicant = new Applicant("Tope",Role.APPLICANT, ApplicantE.QUALIFIED);
        Applicant WRT = new Applicant("kunle", Role.APPLICANT, ApplicantE.UNQUALIFIED);


        managerService.saveStaff(store, manager);
        managerService.hire(store,manager,WRT);
       managerService.hire(store,manager,applicant);












    }









}
