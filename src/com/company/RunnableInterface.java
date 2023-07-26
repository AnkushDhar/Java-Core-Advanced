package com.company;

class MyRunnable1 implements Runnable {
    public void run () {
        int i = 0;
        while (i<1000) {
            System.out.println("MyRunnable 1");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable {
    public void run () {
        int i = 0;
        while (i<1000) {
            System.out.println("MyRunnable 2");
            i++;
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

