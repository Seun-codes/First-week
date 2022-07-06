package org.example.Implement;

import org.example.Enums.ApplicantE;
import org.example.Enums.Role;
import org.example.Interfaces.ManagerServiceInterface;
import org.example.model.Applicant;
import org.example.model.Product;
import org.example.model.Staff;
import org.example.model.Store;

import java.util.ArrayList;
import java.util.List;

public class ManagerServiceInterfaceImpl implements ManagerServiceInterface {

    private List<Staff> employee = new ArrayList<>();

    private List<Applicant> applicant = new ArrayList<>();

    @Override
    public void saveStaff(Store store, Staff staff) {
        employee.add(staff);
        store.setListOfStaff(employee);
    }

    @Override
    public boolean hire(Store store, Staff manager, Applicant applicant) {
        if (manager.getRole().equals(Role.MANAGER) && applicant.getQualification().equals(ApplicantE.QUALIFIED)) {
            applicant.setHired(true);
            applicant.setRole(Role.CASHIER);

            System.out.println(applicant.getName() + " congratulations you have been hired  .");
            return true;
        } else {
            System.out.println(applicant.getName() + " unfortunately you can not be  hired  .");
            return false;
        }
    }
}
