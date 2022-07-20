package org.example.Implement;

import lombok.Getter;
import org.example.Interfaces.CashierService;
import org.example.model.DTO;
import org.example.model.Person;
import org.example.model.Product;
import org.example.model.ProductComparator;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
@Getter
public class CashierServiceImpl extends Person implements CashierService {
    private List<Product> product;
    private String customer;


    //private Queue<CustomerServiceInterfaceImpl> cartList = new

    public CashierServiceImpl(String name, int passcode) {
        super(name, passcode);
    }



    @Override
    public int giveOutReceipt(CustomerServiceInterfaceImpl customer, List<Product> customerCart) {
        int output = 0;
        if(customerCart.size() < 0 ){
            System.out.println("The customer's cart is empty");
            output =1;
        } else {
            double totalCost = 0;
            for(Product prod : customerCart){
                totalCost += (prod.getPrice() * prod.getBuyingQuantity());
            }
            System.out.println("*".repeat(70));
            System.out.println(customer.getCustomerName() +" " + " here is your receipt for products bought." );
            for(Product prod : customerCart){
                System.out.println(prod.getName() +":"  + " Qty= " + prod.getBuyingQuantity() + " , " + "Price= " + prod.getPrice());
            }
            System.out.println("Total Cost: " + totalCost);
            System.out.println("Thanks for the patronage!");
            output = 0;
        }
        return output;
    }

    private Queue<DTO> Carrot = new PriorityQueue<>(new ProductComparator());
    private Queue<DTO> Arrowroot = new PriorityQueue<>(new ProductComparator());
    private Queue<DTO> PotatoChips = new PriorityQueue<>(new ProductComparator());

    public String comparingProduct(CustomerServiceInterfaceImpl customer){
        String output = " ";
        for(Product products : customer.getCustomerCart()){
            if(products.getName().trim().equalsIgnoreCase("Carrot")){
                Carrot.add(new DTO(products.getName(), products.getQuantity(),customer.getCustomerName()));
                System.out.println("Carrot added to queue");
                output = "Carrot added to queue";
            } else if (products.getName().trim().equalsIgnoreCase("Arrowroot")) {
                Arrowroot.add(new DTO(products.getName(), products.getQuantity(), customer.getCustomerName()));
                System.out.println("Arrowroot added to queue");
                output = "Arrowroot added to queue";
            } else if (products.getName().trim().equalsIgnoreCase("Potato chips")) {
                PotatoChips.add(new DTO(products.getName(), products.getQuantity(), customer.getCustomerName()));
                System.out.println("Potato chips added to queue");
                output ="Potato chips added to queue";
            }
        }

        return output;
    }



}
