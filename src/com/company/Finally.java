package com.company;

public class Finally {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(greet());
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("This is finally for value of b = "+b);
            }
            b--;
        }
    }
}
