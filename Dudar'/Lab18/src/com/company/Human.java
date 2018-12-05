package com.company;

public abstract class Human {
    private String name, lastName;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public abstract void displayInfo();
}
