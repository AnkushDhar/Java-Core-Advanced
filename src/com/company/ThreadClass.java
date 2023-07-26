package com.company;

class MyThread1 extends Thread {
    public void run () {
        int i = 0;
        while (i < 2500) {
            System.out.println("MyThread1 running");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    public void run () {
        int i = 0;
        while (i < 2500) {
            System.out.println("MyThread2 running");
            i++;
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();
    }
}

