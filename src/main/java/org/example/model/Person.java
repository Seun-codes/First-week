package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    private String name;
    private int passcode;

    private boolean isHired;

    public Person(String name, int passcode) {
        this.name = name;
        this.passcode = passcode;
    }


}
