package com.company;

public class Employee extends Human{

    private String bank;

    public Employee(String name, String lastName, String company) {
        super(name, lastName);
        this.bank = company;
    }

    public void displayInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("Work: " + bank);
    }
}
