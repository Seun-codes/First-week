package org.example.Interfaces;

import org.example.Implement.CustomerServiceInterfaceImpl;
import org.example.model.Product;

import java.util.List;
import java.util.PriorityQueue;

public interface CashierService {




   // Boolean productIsAvailable(Product products, PriorityQueue<Product> queue);


   // Boolean CheckingForProductQuantity(Product productInCart,CustomerServiceInterfaceImpl customer, PriorityQueue<Product> tempCart);


    int giveOutReceipt(CustomerServiceInterfaceImpl customer, List<Product> customerCart);



}
