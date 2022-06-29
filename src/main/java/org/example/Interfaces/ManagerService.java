package org.example.Interfaces;

import org.example.model.Applicant;
import org.example.model.Staff;
import org.example.model.Store;

public interface ManagerService {
    void saveStaff(Store store, Staff staff);
    boolean hire(Store store, Staff manager, Applicant employee);
}
