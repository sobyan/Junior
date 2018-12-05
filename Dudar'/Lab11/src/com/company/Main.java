package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    //func(3, 4);
        //readArray();
        //compare();
        //function(2,5,3);
        System.out.println("Division of 3 numbers equals: " + function(200, 1, 0));
    }

    public static int function (int a, int b, int c) {
        int division = 0;
        //int division = a / b / c;
        if (b > 0 && c > 0 )
            division = a / b / c;
        else if (b == 0 || c == 0)
            division = 1;
        return division;
    }

    public static void compare () {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        a = scanner.nextInt();
        System.out.print("Enter a second number: ");
        b = scanner.nextInt();
        if (a > b)
            System.out.println(a + " > " + b);
        else if (a < b)
            System.out.println(a + " < " + b);
        else if (a == b)
            System.out.println(a + " = " + b);
    }

    public static int[] readArray () {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;

    }

    public static void func (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.println(result);

    }
}
