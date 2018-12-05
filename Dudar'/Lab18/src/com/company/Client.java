package com.company;

public class Client extends Human{

    private String bank;

    public Client(String name, String lastName, String company) {
        super(name, lastName);
        this.bank = company;
    }

    public void displayInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("Client: " + bank);
    }
}
