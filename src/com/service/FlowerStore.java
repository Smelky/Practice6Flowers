package com.service;

import com.flowers.Chamomile;
import com.flowers.Flower;
import com.flowers.Rose;
import com.flowers.Tulip;

public class FlowerStore {
    private int wallet;
    private Flower[] showBouquetOfFlowersForSell;
    private Flower[] showBouquetOfFlowersForSellSequence;

    public Flower[] sell(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        Flower[] arrayOfFlowers = new Flower[numOfFlowers];
        createFlowers(arrayOfFlowers, numOfRose, numOfTulip, numOfChamomile);
        showBouquetOfFlowersForSell = arrayOfFlowers;
        return arrayOfFlowers;

    }

    public Flower[] sellSequence(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        Flower[] arrayOfFlowers = new Flower[numOfFlowers];
        int temp;
        for (int i = 0; i < numOfFlowers; i += temp) {
            temp = 0;
            if (numOfRose > 0) {
                arrayOfFlowers[i] = new Rose();
                temp++;
                numOfRose--;
                wallet += Rose.getPrice();
            }
            if (numOfChamomile > 0) {
                arrayOfFlowers[i + temp] = new Chamomile();
                temp++;
                numOfChamomile--;
                wallet += Chamomile.getPrice();
            }
            if (numOfTulip > 0) {
                arrayOfFlowers[i + temp] = new Tulip();
                temp++;
                numOfTulip--;
                wallet += Tulip.getPrice();
            }
        }
        showBouquetOfFlowersForSellSequence = arrayOfFlowers;
        return arrayOfFlowers;
    }

    private Flower[] createFlowers(Flower[] arrayOfFlowers, int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        for (int i = 0; i < numOfRose; i++) {
            arrayOfFlowers[i] = new Rose();
            wallet += Rose.getPrice();
        }
        for (int i = numOfRose; i < numOfTulip + numOfRose; i++) {
            arrayOfFlowers[i] = new Tulip();
            wallet += Tulip.getPrice();
        }
        for (int i = numOfTulip + numOfRose; i < numOfFlowers; i++) {
            arrayOfFlowers[i] = new Chamomile();
            wallet += Chamomile.getPrice();
        }
        return arrayOfFlowers;
    }

    public void getWalletCount() {
        System.out.println("The shop wallet has: " + wallet + " UAH");
    }

    public void showBouquetOfFlowers() {
        for (int i = 0; i < showBouquetOfFlowersForSell.length; i++) {
            System.out.print(showBouquetOfFlowersForSell[i].getClass().getSimpleName());
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
        for (int i = 0; i < showBouquetOfFlowersForSellSequence.length; i++) {
            System.out.print(showBouquetOfFlowersForSellSequence[i].getClass().getSimpleName());
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
    }
}
