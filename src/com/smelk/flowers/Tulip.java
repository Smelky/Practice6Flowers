package com.smelk.flowers;

public class Tulip extends Flower {
    private static int price = 45;

    public static int getPrice() {
        return price;
    }

    public void getName() {
        System.out.print("Tulip");
    }
}
