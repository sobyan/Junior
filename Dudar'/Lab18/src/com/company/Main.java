package com.company;

public class Main {

    public static void main(String[] args) {

        Human employee = new Employee("Ivan", "Ivanov","Clerk");
        employee.displayInfo();
        Human client = new Client("Petr", "Petrov", "Client");
        client.displayInfo();
	    /*Shape circle = new Circle();
	    circle.draw();*/
    }
}
