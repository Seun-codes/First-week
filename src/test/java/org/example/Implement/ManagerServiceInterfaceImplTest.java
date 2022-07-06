package org.example.Implement;

import org.example.Enums.ApplicantE;
import org.example.Enums.Role;
import org.example.model.Applicant;
import org.example.model.Staff;
import org.example.model.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerServiceImplTest {
    ManagerServiceImpl managerService = new ManagerServiceImpl();
    Store store;

    Staff manager = new Staff("Temi", 123, Role.MANAGER );

    Applicant applicant = new Applicant("Tope",Role.APPLICANT, ApplicantE.QUALIFIED);
    Applicant WRT = new Applicant("kunle", Role.APPLICANT, ApplicantE.UNQUALIFIED);



    @BeforeEach
    void setUp() {


    }

    @Test
    void hire() {

        Assertions.assertTrue(managerService.hire(store,manager,applicant));
    }
}