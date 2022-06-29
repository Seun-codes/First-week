package org.example.model;

public abstract class Person {
    private String name;
    private int passcode;

    private boolean isHired;

    public Person(String name, int passcode) {
        this.name = name;
        this.passcode = passcode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }
}
