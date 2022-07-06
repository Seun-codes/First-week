package org.example.Interfaces;

import org.example.Implement.CustomerServiceInterfaceImpl;
import org.example.model.Product;

import java.util.List;

public interface CashierService {


    int sell(CustomerServiceInterfaceImpl customer, List<Product> customerCart);

}
