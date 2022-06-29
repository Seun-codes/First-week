package org.example.model;

import org.example.Enums.ApplicantE;
import org.example.Enums.Role;

import java.util.ArrayList;
import java.util.List;

public class Applicant extends Person {
    private static final int passcode = 0;
    private List<Person>employee = new ArrayList();
    private Role role;
    private ApplicantE qualification;

    private boolean isHired;

    public Applicant(String name, Role role, ApplicantE qualification) {
        super(name, passcode);
        this.role = role;
        this.qualification= qualification;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ApplicantE getQualification() {
        return qualification;
    }

    public void setQualification(ApplicantE qualification) {
        this.qualification = qualification;
    }

    public List<Person> getEmployee() {
        return employee;
    }


    public void setEmployee(List<Person> employee) {
        this.employee = employee;
    }

    public void addEmployee (Person employee){
        this.employee.add(employee);
    }

    @Override
    public void setHired(boolean hired) {
        isHired = hired;
    }
}
