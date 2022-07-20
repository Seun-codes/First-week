package org.example.Interfaces;

import org.example.Implement.CustomerServiceInterfaceImpl;
import org.example.model.Product;
import org.example.model.Store;

public interface CustomerServiceInterface {



    int buy(CustomerServiceInterfaceImpl customer, String productName, String category,int buyingQuantity,Store store);
}
