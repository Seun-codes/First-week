package org.example.Implement;

import lombok.Getter;
import org.example.Interfaces.CashierService;
import org.example.model.DTO;
import org.example.model.Person;
import org.example.model.Product;
import org.example.model.ProductComparator;

import java.util.*;

@Getter
public class CashierServiceImpl extends Person implements CashierService {
//    private List<Product> product;
//    private String customer;
    private Queue<DTO> Carrot = new PriorityQueue<>(new ProductComparator());
    private Queue<DTO> Arrowroot = new PriorityQueue<>(new ProductComparator());
    private Queue<DTO> PotatoChips = new PriorityQueue<>(new ProductComparator());
    private Queue<Product> productsQueue = new LinkedList<>();
    //private Queue<Product> productQueue = new PriorityQueue<>(new ProductComparator());





    public CashierServiceImpl(String name, int passcode) {
        super(name, passcode);
    }



    @Override
    public int giveOutReceipt(CustomerServiceInterfaceImpl customer, List<Product> customerCart) {
        int output = 0;
        if(customerCart.size() <= 0  ){
            System.out.println("The customer's cart is empty");
            output =1;
        } else {
            double totalCost = 0;
            for(Product prod : customerCart){
                totalCost += (prod.getPrice() * prod.getBuyingQuantity());
            }
            System.out.println("*".repeat(70));
           // System.out.println(customer.getCustomerName() +" " + " here is your receipt for products bought." );
            for(Product prod : customerCart){
                //System.out.println(prod.getName() +":"  + " Qty= " + prod.getBuyingQuantity() + " , " + "Price= " + prod.getPrice());
            }
            System.out.println("Total Cost: " + totalCost);
            System.out.println("Thanks for the patronage!");
            output = 0;
        }
        return output;
    }







    public String addingToPriorityQueue(CustomerServiceInterfaceImpl customer){
        String output = "";
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

    public String PrioritySell(CustomerServiceInterfaceImpl customer){
        //addingToPriorityQueue(customer);

        //for (Product products : customer.getCustomerCart()){
           // if(products.getName().equalsIgnoreCase("Carrot")){
                while (!Carrot.isEmpty()){

                    System.out.println(Carrot.peek().getQuantity() + " " + Carrot.peek().getProductName()
                            + " sold to " + Carrot.poll().getCustomerName());

                }
                while (!Arrowroot.isEmpty()){

                    System.out.println(Arrowroot.peek().getQuantity() + " " + Arrowroot.peek().getProductName()
                            + " sold to " + Arrowroot.poll().getCustomerName());
                }
                while (!PotatoChips.isEmpty()){

                    System.out.println(PotatoChips.peek().getQuantity() + " " + PotatoChips.peek().getProductName()
                            + " sold to " + PotatoChips.poll().getCustomerName());
                }
          //  }

        return "";
    }



    public String fIFO(CustomerServiceInterfaceImpl customer) {
        String output = " ";
        for(Product products : customer.getCustomerCart()){
            if(products.getName().equalsIgnoreCase(products.getName())){
                productsQueue.add(products);
                return "Products added to queue";
//                while (productsQueue.peek() != null){
//                    System.out.println(productsQueue.peek().getQuantity() + " " + productsQueue.peek().getName()
//                            + " sold to " + productsQueue.poll().getBoughtBy());
//                }
            }else{
                return  "No product added to queue ";
            }
        }
        return output;
    }


    public String fiFOSell(CustomerServiceInterfaceImpl customer){
        String output = " ";
        if(!fIFO(customer).isEmpty()){
            while (productsQueue.peek() != null){
                calculate(customer);
                System.out.println (productsQueue.peek().getQuantity() + " " + productsQueue.peek().getName() + " " + " sold to "
                + productsQueue.poll().getBoughtBy());
            }
        }
        return output;
    }

    public int calculate(CustomerServiceInterfaceImpl customer){
         int output = 0;
        if(!fIFO(customer).isEmpty()){

            //while (productsQueue.peek() !=null){
                double totalCost = productsQueue.peek().getQuantity() * productsQueue.peek().getPrice();
                System.out.println(totalCost);
                productsQueue.remove();
                output = 0;
           // }
        }
        return output;
    }

}


