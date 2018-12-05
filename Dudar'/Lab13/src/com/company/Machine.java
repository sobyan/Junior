package com.company;

public class Machine {

    String brand;
    char color;
    int speed;
    float weight;

    public void carProperty () {
        System.out.println("Machine: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Weight: " + weight);
    }

    public  Machine () {}

    public Machine (String b, char c, int s, float w) {
        brand = b;
        color = c;
        speed = s;
        weight = w;
    }
}
