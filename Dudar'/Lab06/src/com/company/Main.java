package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//SomeMath someMath = new SomeMath();
	//someMath.Mathematics();
    //MoonWeight moonWeight = new MoonWeight();
    //moonWeight.objectMoonWeight();

        //Rectangle rectangle = new Rectangle();
        //rectangle.perimeterRectangle();
        //rectangle.squareRectangle();

        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51;

        if (first >= second && isTrue) {
            System.out.print("Num is 10");
            System.out.print("\n");
        } else if (first == 45)
            System.out.print("Num is equal 45");
         else
            System.out.print("Num is lower than " + second);

         switch (first) {
             case 51:
                 System.out.print("Num is equals 51");
                 break;
             case 48:
                 System.out.println("Num is equals 48");
                 break;
             case 57:
                 System.out.print("Num is equals 57");
                 break;
                 default:
                     System.out.print("Num is equals something");
         }
    }
}
