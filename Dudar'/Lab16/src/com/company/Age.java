package com.company;
import java.util.Scanner;

public class Age {
    Scanner scanner = new Scanner(System.in);
    protected int a;

    public void askAge () {
        a = scanner.nextInt();
    }
}
