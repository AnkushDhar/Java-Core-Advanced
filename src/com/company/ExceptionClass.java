package com.company;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a<9) {
            try {
//                throw new MyException();
                throw new ArithmeticException("This is an Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
//                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
