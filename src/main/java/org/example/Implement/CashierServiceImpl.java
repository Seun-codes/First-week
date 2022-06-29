package org.example.Implement;

import org.example.Interfaces.CashierService;
import org.example.model.Person;
import org.example.model.Product;
import org.example.model.Store;

import java.util.List;

public class CashierServiceImpl implements CashierService {
    private List<Product> product;
    private String customer;

    public CashierServiceImpl(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public boolean sellProduct(Product product) {
        if(product.getProductQuantity() > 0){
            System.out.println("Make payment");
            return true;
        }
        return false;
    }

    @Override
    public boolean issueReceipt() {
        if(customer == customer ){
            System.out.println("Receipt issued");
            return true;
        }
        return false;
    }
}
