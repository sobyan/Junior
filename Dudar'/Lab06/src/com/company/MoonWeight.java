package com.company;

import java.util.Scanner;

public class MoonWeight {

    final float percentEarthWeight = 100;
    final float percentMoonWeight = 17;
    float weight, result;

    public void objectMoonWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight = scanner.nextFloat();
        result = (weight * percentMoonWeight) / percentEarthWeight;
        System.out.println("Your weight on the moon equals " + result + " kg");
    }
}
