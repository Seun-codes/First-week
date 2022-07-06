package org.example.Implement;

import org.example.Enums.Role;
import org.example.Interfaces.CustomerService;
import org.example.model.Product;
import org.example.model.Store;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private String customerName;

    private List<Product> customerCart;


    public CustomerServiceImpl(String customerName) {
        this.customerName = customerName;
        this.customerCart =new ArrayList<>();
    }

    public CustomerServiceImpl(String customerName, List<Product> customerCart) {
        this.customerName = customerName;
        this.customerCart = customerCart;
    }






    @Override
    public boolean buy(String productName, String category, Product product, int buyingQuantity, Store store) {


        for(Product prod : store.getProductList()){
            if(prod.getName().trim().toLowerCase()
                    .equals(productName.toLowerCase().trim()) &&
            prod.getQuantity() >= buyingQuantity && category.equals(prod.getCategory()))

            {
                this.customerCart.add(prod);
                prod.setBuyingQuantity(buyingQuantity);
                prod.setQuantity(prod.getQuantity() - buyingQuantity);
                System.out.println(prod.getName() + " added to cart ");
                return false;
            } else if (prod.getName().trim().toLowerCase().equals(productName.trim().toLowerCase()) &&
            prod.getCategory().toLowerCase().equals(category.toLowerCase()) &&
                    prod.getQuantity() < buyingQuantity) {
                System.out.println("We only have " + prod.getQuantity() + " " + prod.getName() + " in the store kindly re-order ");
                return true;
            } else if (prod.getName().trim().toLowerCase().equals(productName.trim().toLowerCase()) &&
            !prod.getCategory().equals(category)) {
                System.out.println(productName + "does not belong to this category, kindly try"
                + prod.getCategory() + " category ");
                return true;
            }

        }
        System.out.println("Product out of stock, kindly change your order.");


        return  true;
    }


    public List<Product> getCustomerCart() {

        return customerCart;
    }

    public String getCustomerName() {
        return customerName;
    }
}
