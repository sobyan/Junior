package com.company;

public class Plain {
    class Wing {
        int weight = 500;
        public void wingWeight() {
            System.out.println("Weight of wing is " + weight);
        }
    }

    Wing wing = new Wing();
}
