package com.company;

public class Mathematics {

   private static int res = 0;

    public void sum(int a, int b) {
        System.out.println("Sum of elements: " + (a + b));
        res = res + (a + b);
        System.out.println("Common Sum of elements: " + res);
    }

    public int mult (int a, int b) {
        return a * b;
    }
}
