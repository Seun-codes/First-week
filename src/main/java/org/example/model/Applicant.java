package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.Enums.ApplicantE;
import org.example.Enums.Role;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Applicant extends Person {
    private static   int passcode = 0;

    private Role role;
    private ApplicantE qualification;

    private boolean isHired;

    public Applicant(String name, Role role, ApplicantE qualification) {
        super(name, passcode);
        this.role = role;
        this.qualification= qualification;
    }



    @Override
    public void setHired(boolean hired) {
        isHired = hired;
    }
}
