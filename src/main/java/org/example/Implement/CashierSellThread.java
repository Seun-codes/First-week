package org.example.Implement;

import org.example.model.Product;

import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class CashierSellThread implements Runnable {


    private CustomerServiceInterfaceImpl customer;
    private CashierServiceImpl cashier;

    public CashierSellThread(CustomerServiceInterfaceImpl customer, CashierServiceImpl cashier) {
        this.customer = customer;
        this.cashier = cashier;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            transactions();
            if(cashier.fIFO(customer).isEmpty()){
                System.out.println("Queue is empty!");
            }

        }



    }

    public synchronized void transactions(){
        if(!cashier.fIFO(customer).isEmpty()){
            System.out.println(Thread.currentThread().getName() +" "+ "is running");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            cashier.calculate(customer);
            System.out.println(Thread.currentThread().getName() + "purchase successful");
        }else {
            System.out.println("cart is empty for this " + Thread.currentThread().getName() );
        }
    }


}

