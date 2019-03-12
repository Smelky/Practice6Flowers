package com.smelk.flowers;

public class FlowerStore {
    private int wallet;
    private Flower[] bouquetOfFlowersForSell;
    private Flower[] bouquetOfFlowersForSellSequence;

    public Flower[] sell(int numOfRose, int numOfTulip, int numOfChamomile) {
        int numOfFlowers = numOfChamomile + numOfRose + numOfTulip;
        Flower[] arrayOfFlowers = new Flower[numOfFlowers];
        createFlowers(arrayOfFlowers, numOfRose, numOfTulip, numOfChamomile);
        bouquetOfFlowersForSell = arrayOfFlowers;
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
        bouquetOfFlowersForSellSequence = arrayOfFlowers;
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
        for (int i = 0; i < bouquetOfFlowersForSell.length; i++) {
            bouquetOfFlowersForSell[i].getName();
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
        for (int i = 0; i < bouquetOfFlowersForSellSequence.length; i++) {
            bouquetOfFlowersForSellSequence[i].getName();
            System.out.print(", ");
        }
        System.out.println("and greeting card.");
    }
}
