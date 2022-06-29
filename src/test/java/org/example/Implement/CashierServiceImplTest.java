package org.example.Implement;

import org.example.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceImplTest {
    CashierServiceImpl cashier = new CashierServiceImpl ("Bimbo");
    Product product = new Product("gala",32);


    @BeforeEach
    void setUp() {

    }

    @Test
    void sellProduct() {
        Assertions.assertTrue(cashier.sellProduct(product));
    }

    @Test
    void issueReceipt() {
        Assertions.assertTrue(cashier.issueReceipt());
    }
}