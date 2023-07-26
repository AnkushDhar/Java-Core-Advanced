package com.company;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can not be negative";
    }
}
public class Throw_Throws {
    public static double area (int r) throws NegativeRadiusException{
        if (r<0) {
            throw new NegativeRadiusException();
        }
        return Math.PI*Math.pow(r, 2);
    }
    public static int divide (int a, int b) throws ArithmeticException {
        return a/b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(divide(6, 0));
        } catch (Exception e) {
            System.out.println("Exception");
        }
        try {
            System.out.println(area(-1));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
