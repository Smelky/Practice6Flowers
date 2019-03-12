package com;

import com.service.FlowerStore;

public class FlowersApplication {

    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore();

        flowerStore.sell(2, 2, 2);
        flowerStore.sellSequence(5, 3, 1);
        flowerStore.showBouquetOfFlowers();
        flowerStore.getWalletCount();

    }
}
