package com.company;

public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("Is Start = " + isStart);
        }

        public void shutDown() {
            isStart = false;
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start() {
            isStart = true;
        }

        public void shutDown() {
            isStart = false;
        }
    }

    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();
}
