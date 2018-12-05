package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    Scanner scanner = new Scanner(System.in);
    int a;
    public void input() {
        try {
            System.out.print("Enter a number: ");
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error " + e);
        } finally {
            System.out.println("Finally is working: " + a);
        }
    }
}
