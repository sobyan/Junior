package com.company;

public class Tree {
    String nameTree;
    public int ageTree;
    boolean live;

    public Tree (String n ,int a) {
        nameTree = n;
        ageTree = a;
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("");
    }

    public Tree (String n, int a, boolean l) {
        nameTree = n;
        ageTree = a;
        live = l;
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("Live: " + l);
        System.out.println("");
    }

    public Tree () {
        System.out.println("Constructor without parametrs is worked!");
    }

}
