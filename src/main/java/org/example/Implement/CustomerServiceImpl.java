package org.example.Implement;

import org.example.Interfaces.CustomerService;
import org.example.model.Product;
import org.example.model.Store;

public class CustomerServiceImpl implements CustomerService {


    @Override
    public boolean canBuy(Product product, Store store) {
        if(product.getProductQuantity() != 0 ){

            return true;
        }
        return false;
    }


}
