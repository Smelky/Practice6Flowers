package com.flowers.kyiv.service;

import com.flowers.kyiv.entity.Chamomile;
import com.flowers.kyiv.entity.Flower;
import com.flowers.kyiv.entity.Rose;
import com.flowers.kyiv.entity.Tulip;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    private int wallet;

    public Flower[] sell(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        Flower[] arrayOfFlowers = new Flower[numOfFlowers];
        createFlowers(arrayOfFlowers, numOfRose, numOfTulip, numOfChamomile);
        showBouquetOfFlowers(arrayOfFlowers);
        return arrayOfFlowers;

    }

    public Flower[] sellSequence(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        List<Flower> listOfFlowers = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < numOfFlowers; i++) {
            if (i < numOfRose) {
                listOfFlowers.add(new Rose());
                wallet += listOfFlowers.get(temp).getPrice();
                temp++;
            }
            if (i < numOfChamomile) {
                listOfFlowers.add(new Chamomile());
                wallet += listOfFlowers.get(temp).getPrice();
                temp++;
            }
            if (i < numOfTulip) {
                listOfFlowers.add(new Tulip());
                wallet += listOfFlowers.get(temp).getPrice();
                temp++;
            }
        }
        Flower[] arrayOfFlower = new Flower[listOfFlowers.size()];
        arrayOfFlower = listOfFlowers.toArray(arrayOfFlower);
        showBouquetOfFlowersSequence(arrayOfFlower);
        return arrayOfFlower;
    }

    private Flower[] createFlowers(Flower[] arrayOfFlowers, int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        for (int i = 0; i < numOfRose; i++) {
            arrayOfFlowers[i] = new Rose();
            wallet += arrayOfFlowers[i].getPrice();
        }
        for (int i = numOfRose; i < numOfTulip + numOfRose; i++) {
            arrayOfFlowers[i] = new Tulip();
            wallet += arrayOfFlowers[i].getPrice();
        }
        for (int i = numOfTulip + numOfRose; i < numOfFlowers; i++) {
            arrayOfFlowers[i] = new Chamomile();
            wallet += arrayOfFlowers[i].getPrice();
        }
        return arrayOfFlowers;
    }

    public void getWalletCount() {
        System.out.println("The shop wallet has: " + wallet + " UAH");
    }

    private void showBouquetOfFlowers(Flower[] showBouquetOfFlowersForSell) {
        for (Flower flower : showBouquetOfFlowersForSell) {
            System.out.print(flower.toString());
            System.out.print(", ");
        }
        System.out.println("and greeting card.");

    }

    private void showBouquetOfFlowersSequence(Flower[] showBouquetOfFlowersForSellSequence) {
        for (Flower flower : showBouquetOfFlowersForSellSequence) {
            System.out.print(flower.toString());
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
    }
}
