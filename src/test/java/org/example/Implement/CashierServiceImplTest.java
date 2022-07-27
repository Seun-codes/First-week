package org.example.Implement;

import org.example.Enums.Role;
import org.example.model.Product;
import org.example.model.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceImplTest {

    CashierServiceImpl cashier;
    Store store;
    Product products ;
    Product product1;
    Product product2 ;
    Product product3 ;


    List<Product> productList;
    CustomerServiceInterfaceImpl customer3;
    CustomerServiceInterfaceImpl customer1;
    CustomerServiceInterfaceImpl customer2;
    CustomerServiceInterfaceImpl customer4;
    CustomerServiceInterfaceImpl customer5;




    @BeforeEach
    void setUp() {
        store = new Store("store", Role.MANAGER);
        cashier = new CashierServiceImpl("TLA", 334);
       customer3 = new CustomerServiceInterfaceImpl("bola");
       customer2 = new CustomerServiceInterfaceImpl("lola");
       customer1 = new CustomerServiceInterfaceImpl("kola");
       customer4 = new CustomerServiceInterfaceImpl("linda");
       customer5 = new CustomerServiceInterfaceImpl("tunde");
       products = new Product("Cookies","Arrowroot",300,2.18);
       product1 = new Product("Cookies","Oatmeal Raisin",300,2.18);
       product2 = new Product("Bars","Carrot",300,1.77);
       product3 = new Product("Snacks","Potato chips",300,1.35);
        store.getProductList().add(products);
        store.getProductList().add(product1);
        store.getProductList().add(product2);
        store.getProductList().add(product3);
        customer3.buy(customer3,"Arrowroot","Cookies",6,store);
        customer1.buy(customer1,"Potato chips","Snacks",4,store);
        customer2.buy(customer2,"Carrot","Bars",6,store);






    }

    @Test
    void sell() {

        int actual = cashier.giveOutReceipt(customer2,customer2.getCustomerCart());
        assertEquals(0,actual);

    }

    @Test
    void comparingProduct() {
//Checking for product Name
        cashier.addingToPriorityQueue(customer3);
        cashier.addingToPriorityQueue(customer2);
        cashier.addingToPriorityQueue(customer1);

    }

    @Test
    void EmptyCart() {

         cashier.giveOutReceipt(customer5,customer5.getCustomerCart());
         cashier.giveOutReceipt(customer4,customer4.getCustomerCart());



    }

    @Test
    void Test_toAddCashier() {
        cashier = new CashierServiceImpl("TLA", 334);
    }

    @Test
    void test_addToFIFO() {
        cashier.fIFO(customer1);
        cashier.fIFO(customer2);
        cashier.fIFO(customer3);


    }

    @Test
    void prioritySell() {
        cashier.PrioritySell(customer2);
        cashier.PrioritySell(customer1);
        cashier.PrioritySell(customer3);
    }
}