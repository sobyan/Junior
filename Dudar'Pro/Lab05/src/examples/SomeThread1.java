package examples;

public class SomeThread1 extends Thread{
    public void run () {
        for (int i = 100; i > 90; i--) {
            System.out.println("Number - " + i);
        }
    }
}
