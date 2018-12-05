package com.company;

public class modifyAge extends Age {

    private int b;

    public void askAge() {
        System.out.print("How many years you are? ");
        b = this.scanner.nextInt();
        System.out.println("User's age is " + b);
    }
}
