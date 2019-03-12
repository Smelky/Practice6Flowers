package com.smelk.flowers;

public class Rose extends Flower {
    private static int price = 100;

    public static int getPrice() {
        return price;
    }

    public void getName() {
        System.out.print("Rose");
    }
}
