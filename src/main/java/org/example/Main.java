package org.example;

import org.example.Enums.Role;
import org.example.FileReader.File;
import org.example.Implement.CashierSellThread;
import org.example.Implement.CashierServiceImpl;
import org.example.Implement.CustomerServiceInterfaceImpl;
import org.example.Implement.ManagerServiceInterfaceImpl;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("store", Role.MANAGER);
        //StoreImpl store1 = new StoreImpl();

        Product products = null;
        List<Product> productList = new ArrayList<>();
        File read = new File("src/main/java/productDetails.csv");
        read.readProductFile(null, store);


        for (Product product : store.getProductList()) {
            System.out.println(product.getName() + " " + product.getQuantity());
        }


        ManagerServiceInterfaceImpl managerService = new ManagerServiceInterfaceImpl();

        // customer.buy("Oatmeal Raisin","Cookies",products,6,store);
        System.out.println("*".repeat(70));

        CustomerServiceInterfaceImpl customer1 = new CustomerServiceInterfaceImpl("bola");
        customer1.buy(customer1,"Arrowroot","Cookies",24,store);
       //customer1.buy(customer1,"Potato chips","Snacks",14,store);
//        customer1.buy(customer1,"Carrot","Bars",54,store);




        CustomerServiceInterfaceImpl customer2 = new CustomerServiceInterfaceImpl("kola");
        customer2.buy(customer2,"Arrowroot","Cookies",90,store);
        //customer2.buy(customer2,"Carrot","Bars",50,store);
//        customer2.buy(customer2,"Potato chips","Snacks",20,store);
        System.out.println("*".repeat(70));
        System.out.println(customer2.getCustomerCart());



        CustomerServiceInterfaceImpl customer3 = new CustomerServiceInterfaceImpl("Tola");
        customer3.buy(customer3,"Arrowroot","Cookies",20,store);
        //customer3.buy(customer3,"Carrot","Bars",70,store);
        //customer3.buy(customer3,"Potato chips","Snacks",10,store);



        CashierServiceImpl cashier1 = new CashierServiceImpl("Joan",123);
        cashier1.giveOutReceipt(customer1, customer1.getCustomerCart());
        cashier1.giveOutReceipt(customer2, customer2.getCustomerCart());
        cashier1.giveOutReceipt(customer3, customer3.getCustomerCart());


        //IMPLEMENTATION OF PRIORITY QUEUE
        System.out.println("*".repeat(70));
        System.out.println("            PRIORITY QUEUE LIST         ");
        System.out.println("*".repeat(70));
        cashier1.addingToPriorityQueue(customer1);
        System.out.println("*".repeat(70));
        cashier1.addingToPriorityQueue(customer2);
        System.out.println("*".repeat(70));
        cashier1.addingToPriorityQueue(customer3);

        System.out.println("*".repeat(70));

        cashier1.PrioritySell(customer1);
        cashier1.PrioritySell(customer2);
        cashier1.PrioritySell(customer3);


        //IMPLEMENTATION OF FIFO
        System.out.println("*".repeat(70));
        System.out.println("            FIFO               ");
        System.out.println("*".repeat(70));
        System.out.println(cashier1.fIFO(customer1));
        System.out.println("*".repeat(70));
        System.out.println(cashier1.fIFO(customer2));
        System.out.println("*".repeat(70));
        System.out.println(cashier1.fIFO(customer3));

        cashier1.fiFOSell(customer1);
        cashier1.fiFOSell(customer2);
        cashier1.fiFOSell(customer3);


        System.out.println("****************************MULTITHREADING IMPLEMENTATION****************************");
        CashierSellThread Trans = new CashierSellThread(customer1,cashier1);
       // CashierSellThread TransT = new CashierSellThread(customer2,cashier1);
        Thread t1 = new Thread(Trans);
        Thread t2 = new Thread(Trans);
        t1.setName("thread one");
        t2.setName("thread two");

        t1.start();
        t2.start();


       // /MULTITHREADING IMPLEMENTATION
//        CopyOnWriteArrayList<Thread> threadList = new CopyOnWriteArrayList<>();
//      //  CashierSellThread  threads= new CashierSellThread(customer1,cashier1);
//       Thread thread0 = new Thread(threads);
//        Thread thread1 = new Thread(threads);
//        Thread thread2 = new Thread(threads);
//       Thread thread3 = new Thread(threads);
//
//       thread0.setName("one");
//       thread1.setName("two");
//       thread2.setName("three");
//       thread3.setName("four");
//
//       threadStart(threadList);



//









//    public static  int threadStart(CopyOnWriteArrayList<Thread> threadList){
//        for (Thread inThread : threadList){
//            inThread.start();
//            try{
//                Thread.sleep(3000);
//                inThread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return 1;
//    }


    }

}
