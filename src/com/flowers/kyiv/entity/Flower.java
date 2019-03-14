package com.flowers.kyiv.entity;

public abstract class Flower {

    private int price;

    public Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
