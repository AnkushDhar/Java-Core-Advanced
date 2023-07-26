package com.company;

import java.util.Scanner;

public class Nested_TryCatch {
    public static void main(String[] args) {
        int [] marks = {56, 87, 32};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter index value: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Hello");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index does not exist");
                    System.out.println("Exception at level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception at level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
