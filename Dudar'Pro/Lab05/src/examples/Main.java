package examples;

class SomeThread extends Thread {

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Number - " + i);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        SomeThread2 some2 = new SomeThread2();
        some2.start();

        SomeThread1 some1 = new SomeThread1();
	    some1.start();



        /*SomeThread test = new SomeThread();
	    test.start();

	    SomeThread test1 = new SomeThread();
	    test1.start();

        *//*SomeThread test2 = new SomeThread();
        test2.start();*//*

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println("Number - " + i);
                }
            }
        });

        t1.start();*/
    }
}
