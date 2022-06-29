package org.example.model;

import org.example.Enums.Role;

public class Staff extends Person {

    private Role role;



    public Staff(String name, int passcode, Role role) {
        super(name, passcode);
        this.role = role;

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}