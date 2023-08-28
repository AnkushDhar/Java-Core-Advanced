package com.company;
@FunctionalInterface
interface A {
    void show ();
}
public class Anonymous {
    public static void main(String[] args) {
        A obj1 = new A() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
        obj1.show();

        // lambda expression
        A obj2 = () -> System.out.println("in show");
        obj2.show();
    }
}
