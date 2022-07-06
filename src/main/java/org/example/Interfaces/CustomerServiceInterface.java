package org.example.Interfaces;

import org.example.model.Product;
import org.example.model.Store;

import java.util.List;

public interface CustomerService {


    public boolean buy (String productName, String category, Product product, int buyingQuantity, Store store);

}
