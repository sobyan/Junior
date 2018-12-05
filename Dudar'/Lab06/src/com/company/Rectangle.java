package com.company;

import java.util.Scanner;

public class Rectangle {
    Scanner scanner = new Scanner(System.in);
    float a, b;

    public void squareRectangle(){
        System.out.println("Сalculation of the square of the rectangle");
        System.out.print("Enter a: ");
        a = scanner.nextFloat();
        System.out.print("Enter b: ");
        b = scanner.nextFloat();
        float square = a * b;
        System.out.println("Square = " + square);
    }

    public void perimeterRectangle(){
        System.out.println("Calculation of the perimeter of the rectangle");
        System.out.print("Enter a: ");
        a = scanner.nextFloat();
        System.out.print("Enter b: ");
        b = scanner.nextFloat();
        float perimeter = 2 * (a + b);
        System.out.println("Perimeter = " + perimeter);
    }
}
