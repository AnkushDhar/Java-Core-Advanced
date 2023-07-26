package com.company;
@FunctionalInterface
interface DemoAno {
    void meth1(int a);
//    void meth2();
}
//class AnonyDemo implements DemoAno {
//    public void display () {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}
public class AnonymousClasses {
    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();
        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();
        // Lambda Expressions
        DemoAno obj = (a) -> {System.out.println("I am Method 1 from this lambda "+a);};
        obj.meth1(6);
    }
}
