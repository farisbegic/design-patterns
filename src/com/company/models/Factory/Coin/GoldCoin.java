package com.company.models.Factory.Coin;

public class GoldCoin implements Coin {
    @Override
    public void getDescription() {
        System.out.println("This is a gold coin.");
    }
}
