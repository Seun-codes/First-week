package org.example.Implement;

import org.example.Interfaces.CustomerService;
import org.example.model.Product;
import org.example.model.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    CustomerService customer = new CustomerServiceImpl();
    CashierServiceImpl cashier = new CashierServiceImpl ("Bimbo");
    Product product = new Product("gala",32);
    Store store = new Store("Store");


    @BeforeEach
    void setUp() {
    }

    @Test
    void canBuy() {
        Assertions.assertTrue(customer.canBuy(product,store));
    }
}