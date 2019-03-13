package com.flowers.kyiv;

import com.flowers.kyiv.service.FlowerStore;

public class FlowersApplication {

    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore();

        flowerStore.sell(2, 2, 2);
        flowerStore.sell(1, 3, 1);
        flowerStore.sellSequence(5, 3, 1);
        flowerStore.sellSequence(2, 3, 2);
        flowerStore.getWalletCount();
    }
}
