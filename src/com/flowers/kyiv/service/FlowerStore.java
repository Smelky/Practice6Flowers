package com.flowers.kyiv.service;

import com.flowers.kyiv.entity.Chamomile;
import com.flowers.kyiv.entity.Flower;
import com.flowers.kyiv.entity.Rose;
import com.flowers.kyiv.entity.Tulip;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    private int wallet;
    private Object[] showBouquetOfFlowersForSell;
    private Object[] showBouquetOfFlowersForSellSequence;

    public Flower[] sell(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        Flower[] arrayOfFlowers = new Flower[numOfFlowers];
        createFlowers(arrayOfFlowers, numOfRose, numOfTulip, numOfChamomile);
        showBouquetOfFlowersForSell = arrayOfFlowers;
        return arrayOfFlowers;

    }

    public Object[] sellSequence(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        List<Flower> listOfFlowers = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < numOfFlowers; i++) {
            if (i < numOfRose) {
                listOfFlowers.add(new Rose(100));
                wallet += listOfFlowers.get(temp).getPrice();
                temp++;
            }
            if (i < numOfChamomile) {
                listOfFlowers.add(new Chamomile(70));
                wallet += listOfFlowers.get(temp).getPrice();
                temp++;
            }
            if (i < numOfTulip) {
                listOfFlowers.add(new Tulip(45));
                wallet += listOfFlowers.get(temp).getPrice();
                temp++;
            }
        }
        showBouquetOfFlowersForSellSequence = listOfFlowers.toArray();
        return listOfFlowers.toArray();
    }

    private Flower[] createFlowers(Flower[] arrayOfFlowers, int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        for (int i = 0; i < numOfRose; i++) {
            arrayOfFlowers[i] = new Rose(100);
            wallet += arrayOfFlowers[i].getPrice();
        }
        for (int i = numOfRose; i < numOfTulip + numOfRose; i++) {
            arrayOfFlowers[i] = new Tulip(45);
            wallet += arrayOfFlowers[i].getPrice();
        }
        for (int i = numOfTulip + numOfRose; i < numOfFlowers; i++) {
            arrayOfFlowers[i] = new Chamomile(70);
            wallet += arrayOfFlowers[i].getPrice();
        }
        return arrayOfFlowers;
    }

    public void getWalletCount() {
        System.out.println("The shop wallet has: " + wallet + " UAH");
    }

    public void showBouquetOfFlowers() {
        for (int i = 0; i < showBouquetOfFlowersForSell.length; i++) {
            System.out.print(showBouquetOfFlowersForSell[i].toString());
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
        for (int i = 0; i < showBouquetOfFlowersForSellSequence.length; i++) {
            System.out.print(showBouquetOfFlowersForSellSequence[i].toString());
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
    }
}
