package org.example.Interfaces;

import org.example.model.Product;
import org.example.model.Store;

public interface CustomerServiceInterface {


    public int buy (String productName, String category, Product product, int buyingQuantity, Store store);

}
