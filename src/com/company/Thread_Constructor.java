package com.company;

class MyThr extends Thread {
    public MyThr (String name) {
        super(name);
    }
    public void run () {
        System.out.println("Thank You");
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Ankush");
        MyThr t2 = new MyThr("Ram Candr");
        t1.start();
        t2.start();
        System.out.println("ID of Thread t1 is "+t1.threadId());
        System.out.println("Name of Thread t1 is "+t1.getName());
        System.out.println("ID of Thread t2 is "+t2.threadId());
        System.out.println("Name of Thread t2 is "+t2.getName());
    }
}
