package com.company;

public class Truck extends Machine{
    int numbWheels;
    int maxWeight;

    public Truck(String brand, char color, int speed, float weight, int numbWheels, int maxWeight) {
        super(brand, color, speed, weight);
        this.numbWheels = numbWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(){
        System.out.println("Machine: " + super.brand);
        System.out.println("Color: " + super.color);
        System.out.println("Speed: " + super.speed);
        System.out.println("Weight: " + super.weight + "t");
        System.out.println("Numbers of Wheels: " + numbWheels);
        System.out.println("Max Weight: " + maxWeight + "t");
    }

}
