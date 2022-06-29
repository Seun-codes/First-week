package org.example.Interfaces;

import org.example.model.Product;
import org.example.model.Store;

public interface CustomerService {
    public boolean canBuy(Product product, Store store);

}
