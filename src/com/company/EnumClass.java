package com.company;

enum Laptop {
    MacBook(2000), Pavilion, XPS(2200), Surface(1500);

    private int price;

    Laptop() {
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop hp = Laptop.Pavilion;
        hp.setPrice(900);
        for (Laptop lap :
                Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice()+"$");
        }
    }
}
