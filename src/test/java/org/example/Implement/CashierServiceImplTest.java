package org.example.Implement;

import org.example.Enums.Role;
import org.example.model.Product;
import org.example.model.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceImplTest {

    CashierServiceImpl cashier;
    Store store;
    Product products = new Product("Cookies", "OatMeal Raisin",6,3.0);
    List<Product> productList;
    CustomerServiceInterfaceImpl customer3;
    CustomerServiceInterfaceImpl customer1;
    CustomerServiceInterfaceImpl customer2;


    @BeforeEach
    void setUp() {

         store = new Store("store", Role.MANAGER);
        cashier = new CashierServiceImpl("TLA", 334);
        customer3 = new CustomerServiceInterfaceImpl("bola");
        customer2 = new CustomerServiceInterfaceImpl("lola");
        customer1 = new CustomerServiceInterfaceImpl("kola");
        store.getProductList().add(products);





        customer3.buy(customer3,"Arrowroot","Cookies",6,store);
        customer1.buy(customer1,"Oatmeal Raisin","Cookies",6,store);
        customer2.buy(customer2,"Oatmeal Raisin","Cookies",6,store);


    }

   // @Test
//    void sell() {
//        int actual = cashier.giveOutReceipt(customer3,customer3.getCustomerCart());
//        assertEquals(0,actual);
//
//    }

    @Test
    void comparingProduct() {
        String actual = cashier.comparingProduct(customer3);
        assertEquals("Arrowroot added to queue",actual);
    }
}