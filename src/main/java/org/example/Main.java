package org.example;

import org.example.Enums.ApplicantE;
import org.example.Enums.Role;
import org.example.Implement.CashierServiceImpl;
import org.example.Implement.CustomerServiceImpl;
import org.example.Implement.ManagerServiceImpl;
import org.example.Interfaces.CashierService;
import org.example.Interfaces.CustomerService;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        ManagerServiceImpl managerService = new ManagerServiceImpl();

        System.out.println("Hello world!");
        Store store = new Store("Store");

        Staff manager = new Staff("Temi", 123, Role.MANAGER );

        managerService.saveStaff(store, manager);

        Applicant applicant = new Applicant("Tope",Role.APPLICANT, ApplicantE.QUALIFIED);
        Applicant WRT = new Applicant("kunle", Role.APPLICANT, ApplicantE.UNQUALIFIED);






        managerService.saveStaff(store, manager);
        managerService.hire(store,manager,WRT);




        CashierServiceImpl cashier = new CashierServiceImpl ("Bimbo");
        cashier.issueReceipt();
        Product product = new Product("gala",32);
        cashier.sellProduct(product);
        CustomerService customer = new CustomerServiceImpl();
        customer.canBuy(product,store);






    }





}