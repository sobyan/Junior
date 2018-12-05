package com.company;

public class Main {

    public static void words (String a, String b) {
        System.out.println(a + " " + b);
        System.out.println("");
    }
    public static void words (int a, int b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("");
    }
    public static void words (float a, boolean b) {
        System.out.println(a + " " + b);
        System.out.println("");
    }

    /*public static int summ (int a, int b) {
        return a + b;
    }

    public static int summ (int a, int b, int g) {
        return a + b + g;
    }*/

    public static void main(String[] args) {
        words("Sammy", "Small Sammy");
        words(5,7);
        words(23.3f, true);
        /*System.out.println(summ(23, 12));
        System.out.println(summ(23, 12, 15));*/
    }
}
