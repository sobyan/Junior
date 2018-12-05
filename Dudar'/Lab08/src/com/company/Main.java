package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        int i;
        //System.out.print("Enter a number:");

        while (true) {
            System.out.print("Enter a number: ");
            i = scanner.nextInt();
            if (i == 0)
                break;
            else if (i == 1)
                continue;
            System.out.println("End of iteration");
        }
        System.out.println("You are out of the loop");*/
        //int i;
        /*for (int i = -7; i <= 12; i += 3) {
        if (i == -1 || i == 5 || i == 11)
                    continue;
            System.out.println(i);
        }*/
        int i = -7;
        do {
            i += 3;
            if (i == -1 || i == 5 || i == 11)
                continue;
            System.out.println(i);
        } while (i <= 12);
            return;

            //System.out.println(i);

    }
}