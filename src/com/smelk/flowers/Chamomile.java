package com.smelk.flowers;

public class Chamomile extends Flower {
    private static int price = 70;

    public static int getPrice() {
        return price;
    }

    public void getName() {
        System.out.print("Chamomile");
    }
}
