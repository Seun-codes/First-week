package org.example.Implement;

import org.example.Interfaces.CashierService;
import org.example.model.Person;
import org.example.model.Product;

import java.util.List;

public class CashierServiceImpl extends Person implements CashierService {
    private List<Product> product;
    private String customer;

    public CashierServiceImpl(String name, int passcode) {
        super(name, passcode);
    }


    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }




    @Override
    public int sell(CustomerServiceInterfaceImpl customer, List<Product> customerCart) {
        int output = 0;
        if(customerCart.size() <1 ){
            System.out.println("The customer's cart is empty");
            output +=1;
        } else {
            double totalCost = 0;
            for(Product prod : customerCart){
                totalCost += (prod.getPrice() * prod.getBuyingQuantity());
            }
            System.out.println(customer.getCustomerName() +" " + " here is your receipt for products bought \n " );

            System.out.println("Thank you for your patronage");

            for(Product prod : customerCart){
                System.out.println(prod.getName() + " , Qty: " + prod.getBuyingQuantity() + " "
                + "Price" + prod.getPrice());
            }
            System.out.println("Total Cost: " + totalCost);
            output += 0;
        }
        return output;
    }
}
