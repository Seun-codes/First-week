package org.example.Interfaces;

import org.example.model.Person;
import org.example.model.Product;
import org.example.model.Store;

public interface CashierService {

    public boolean sellProduct(Product product);

    public boolean issueReceipt();

}
