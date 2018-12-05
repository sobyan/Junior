package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = scanner.nextInt();
        a = new int[n];
        int i = 0;
        do {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = scanner.nextInt();
            i++;
        } while (i < n); {

        }

       /*int[] a = new int[] {5, -2, 9, -3, 28};
       for (int i =0; i < a.length; i++){
           System.out.println(" Element " + i + " in massive is equals " + a[i]);
       }*/
        //int max = 0;
        /*int sum = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] < 0)
                sum += a[i];
        }
        if (sum == 0)
            System.out.println("No numbers > 0");
        else
            System.out.println("Sum = " + sum);*/
        /*for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];        )
        }
        System.out.println("Max number is " + max);*/
	/*int[] a;
	int n;
	Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }*/
	}
}
