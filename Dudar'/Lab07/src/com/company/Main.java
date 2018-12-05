package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*int a = 8;
	    //if (a % 2 == 0)
            //System.out.println(a + " is even number");
	    //else
           // System.out.println(b + " is even number");

        switch (a) {
            case 3:
                System.out.println("Three");
                break;
            case 7:
                System.out.println("Seven");
                break;
                default:
                    System.out.println("Something else");
        }*/
//	    Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a first number: ");
//        int a = scanner.nextInt();
//        System.out.print("Enter a second number: ");
//        int b = scanner.nextInt();
//
//        int res = a / b;
//        res = b != 0 ? res : 1;
//        System.out.println(res);

        /*Scanner scanner = new Scanner(System.in);
        int num1, num2;
        String action;
        System.out.print("Enter action: " );
        action = scanner.nextLine();
        System.out.print("Enter a num1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter a num2: ");
        num2 = scanner.nextInt();

        switch (action){
            case "+" :
                System.out.println("num1 + num2 = " + (num1 + num2));
                break;
            case "-" :
                System.out.println("num1 - num2 = " + (num1 - num2));
                break;
            case "*" :
                System.out.println("num1 * num2 = " + (num1 * num2));
                break;
            case "/" :
                System.out.println("num1 / num2 = " + (num1 / num2));
                break;
                default:
                   System.out.println("Enter + , -, * or /");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        if (a < 8 && a != 5 && a >= 2 || a == -1)
            System.out.println("Good number!");
        else
            System.out.println("Bad number!!!");


    }
}
