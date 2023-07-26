package com.company;

import java.util.Scanner;

public class HandlingSpecificExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {56, 87, 32};
        System.out.print("Enter Index: ");
        int idx = sc.nextInt();
        System.out.print("Enter Value to divide: ");
        int n = sc.nextInt();
        try {
            System.out.println("Value of the index is: "+marks[idx]);
            System.out.println("Value of array-value/number is: "+marks[idx]/n);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occurred");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occurred");
            System.out.println(e);
        }
    }
}
