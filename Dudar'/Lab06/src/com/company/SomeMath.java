package com.company;

import java.util.Scanner;

public class SomeMath {
    Scanner scanner = new Scanner(System.in);
    float first, second;

    public void Mathematics() {
        System.out.println("Enter a first number: ");
        first = scanner.nextFloat();
        System.out.println("Enter a second number: ");
        second = scanner.nextFloat();

        System.out.println("Sum = " + (first + second));
        System.out.println("Sub = " + (first - second));
        System.out.println("Multiply = " + (first * second));
        System.out.println("Division = " + (first / second));
        System.out.println("Residue = " + (first % second));
    }
}
