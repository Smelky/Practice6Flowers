package com.flowers.kyiv;

import com.flowers.kyiv.service.FlowerStore;

public class FlowersApplication {

    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore();

        flowerStore.sell(2, 2, 2);
        flowerStore.sell(1, 3, 1);
        flowerStore.sellSequence(0, 2, 10);
        flowerStore.sellSequence(5, 5, 5);
        flowerStore.sellSequence(3, 1, 5);
        flowerStore.getWalletCount();
    }
}
