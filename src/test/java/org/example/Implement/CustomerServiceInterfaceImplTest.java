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

    CustomerServiceInterfaceImpl customer3;
    CustomerServiceInterfaceImpl customer1;
    CustomerServiceInterfaceImpl customer2;
    CustomerServiceInterfaceImpl customer4;
    CustomerServiceInterfaceImpl customer5;
    CustomerServiceInterfaceImpl customer;
    Store store = new Store("main",Role.MANAGER);
    private List<Product> productList = new ArrayList<>();
    Product products;
    Product product1;
    Product product2 ;
    Product product3 ;
    Product product5 ;

    List <Product> customerCart = new ArrayList<>();

    @BeforeEach
    void setUp() {
        product5 = new Product("Cookies","Arrowroot",300,2.18);
        product1 = new Product("Cookies","Oatmeal Raisin",300,2.18);
        product2 = new Product("Bars","Carrot",300,1.77);
        product3 = new Product("Snacks","Potato chips",300,1.35);
        products = new Product("Cookies","oatMeal Raisin",6,3.0);
        customer = new CustomerServiceInterfaceImpl("dupe");
        customer3 = new CustomerServiceInterfaceImpl("Kingsley");
        customer1 = new CustomerServiceInterfaceImpl("kola");
        customer2 = new CustomerServiceInterfaceImpl("folu");
        customer4 = new CustomerServiceInterfaceImpl("Ayo");
        customer5 = new CustomerServiceInterfaceImpl("leke");
        store.getProductList().add(products);
        store.getProductList().add(product1);
        store.getProductList().add(product2);
        store.getProductList().add(product3);
        store.getProductList().add(product5);

    }



    @Test
    void buy() {

       customer.buy(customer,"Oatmeal Raisin","Cookies",4,store);
       customer1.buy(customer1,"Arrowroot","Cookies",4,store);
       customer2.buy(customer2,"Potato chips","Snacks",4,store);
       customer3.buy(customer3,"Carrot","Bars",4,store);

    }

    @Test
    void testBuy() {
        customer = new CustomerServiceInterfaceImpl("dupe");
        customer3 = new CustomerServiceInterfaceImpl("Kingsley");
        customer1 = new CustomerServiceInterfaceImpl("kola");
        customer2 = new CustomerServiceInterfaceImpl("folu");
    }
}