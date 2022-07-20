package org.example;

import org.example.Enums.Role;
import org.example.FileReader.File;
import org.example.Implement.CashierServiceImpl;
import org.example.Implement.CustomerServiceInterfaceImpl;
import org.example.Implement.ManagerServiceInterfaceImpl;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("store",Role.MANAGER);
       //StoreImpl store1 = new StoreImpl();

        Product products = null;
        List<Product> productList = new ArrayList<>();
        File read = new File("src/main/java/productDetails.csv");
        read.readProductFile(null,store);


        for(Product product : store.getProductList()){
            System.out.println(product.getName() + " " + product.getQuantity());
        }


        ManagerServiceInterfaceImpl managerService = new ManagerServiceInterfaceImpl();


//     CustomerServiceInterfaceImpl customer1 = new CustomerServiceInterfaceImpl("bola");
//     CustomerServiceInterfaceImpl customer1 = new CustomerServiceInterfaceImpl("bola");


       
       // customer.buy("Oatmeal Raisin","Cookies",products,6,store);
        System.out.println("*".repeat(70));

        CustomerServiceInterfaceImpl customer1 = new CustomerServiceInterfaceImpl("bola");
        customer1.buy(customer1,"Arrowroot","Cookies",24,store);
        customer1.buy(customer1,"Potato chips","Snacks",14,store);
        customer1.buy(customer1,"Carrot","Bars",54,store);

        System.out.println("*".repeat(70));
//        CashierServiceImpl cashier = new CashierServiceImpl("TLA", 334);
       // cashier.giveOutReceipt(customer1, customer1.getCustomerCart());


        System.out.println("*".repeat(70));
        CustomerServiceInterfaceImpl customer2 = new CustomerServiceInterfaceImpl("kola");
        customer2.buy(customer2,"Arrowroot","Cookies",90,store);
        customer2.buy(customer2,"Carrot","Bars",50,store);
        customer2.buy(customer2,"Potato chips","Snacks",20,store);
        System.out.println("*".repeat(70));
        //System.out.println(customer2.getCustomerCart());


        System.out.println("*".repeat(70));
        CustomerServiceInterfaceImpl customer3 = new CustomerServiceInterfaceImpl("bola");
        customer3.buy(customer3,"Arrowroot","Cookies",20,store);
        customer3.buy(customer3,"Carrot","Bars",70,store);
        customer3.buy(customer3,"Potato chips","Snacks",10,store);

        CashierServiceImpl cashier1 = new CashierServiceImpl("Joan",123);
        cashier1.giveOutReceipt(customer1, customer1.getCustomerCart());
        cashier1.giveOutReceipt(customer2, customer2.getCustomerCart());
        cashier1.giveOutReceipt(customer3, customer3.getCustomerCart());


        cashier1.comparingProduct(customer1);
        cashier1.comparingProduct(customer2);
        cashier1.comparingProduct(customer3);

        System.out.println("*".repeat(70));
        while(!cashier1.getCarrot().isEmpty()){
            System.out.println(cashier1.getCarrot().poll());
        }

        System.out.println("*".repeat(70));
        while(!cashier1.getArrowroot().isEmpty()){
            System.out.println(cashier1.getArrowroot().poll());
        }

        System.out.println("*".repeat(70));
        while(!cashier1.getPotatoChips().isEmpty()){
            System.out.println(cashier1.getPotatoChips().poll());
        }





        // cashier.CheckingForProductQuantity(customer1.getCustomerCart(),customer2.getCustomerCart(),customer3.getCustomerCart());

       // customer3.buy(customer3,"Arrowroot","Cookies",25,store);


        //System.out.println(store.productCategories("bars"));
       // System.out.println(cashier.PrioritySell("arrowroot",customer1));

       // System.out.println(StoreImpl.getProductPriorityQueue());





















    }









}
