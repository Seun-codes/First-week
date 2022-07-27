package org.example.Implement;

import lombok.Getter;
import org.example.Interfaces.CustomerServiceInterface;
import org.example.model.Product;
import org.example.model.Store;

import java.util.ArrayList;
import java.util.List;
@Getter
public class CustomerServiceInterfaceImpl implements CustomerServiceInterface {

    private String customerName;
    private String customer;

    private List<Product> customerCart;
    public Product product;


    public CustomerServiceInterfaceImpl(String customerName) {
        this.customerName = customerName;
        //this.customer = customer;
        this.customerCart =new ArrayList<>();
    }

    public CustomerServiceInterfaceImpl(String customerName, String customer, List<Product> customerCart) {
        this.customerName = customerName;
        this.customer = customer;
        this.customerCart = customerCart;
    }




    @Override
    public int buy(CustomerServiceInterfaceImpl customer, String productName, String category, int buyingQuantity, Store store) {
        int output = 0;


        for(Product prod : store.getProductList()){
            if(prod.getName().trim().toLowerCase()
                    .equals(productName.toLowerCase().trim()) && prod.getCategory().equals(category) &&
            prod.getQuantity() >= buyingQuantity && category.equals(prod.getCategory()))

            {

               Product productInCart = new Product(category,productName, prod.getPrice(), buyingQuantity);
                customer.getCustomerCart().add(productInCart);
                productInCart.setQuantity(buyingQuantity);
                productInCart.setBoughtBy(getCustomerName());
               prod.setQuantity(prod.getQuantity() - buyingQuantity);
                return output = 0;
            } else if (prod.getName().toLowerCase().equals(productName.toLowerCase()) &&
            prod.getCategory().toLowerCase().equals(category.toLowerCase()) &&
                    prod.getQuantity() < buyingQuantity) {
                System.out.println("We only have " + prod.getQuantity() + " " + prod.getName() + " in the store kindly re-order ");
                return output =1;
             } else if (prod.getName().trim().toLowerCase().equals(productName.trim().toLowerCase()) &&
            !prod.getCategory().equals(category)) {
                System.out.println(productName + " does not belong to this category, kindly try "
                + prod.getCategory() + " category ");
                return output =1;
            }

        }
        System.out.println("Product out of stock, kindly change your order.");
        output =1;

        return  output;
    }



}
