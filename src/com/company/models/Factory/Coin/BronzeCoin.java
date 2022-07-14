package com.company.models.Factory.Coin;

public class BronzeCoin implements Coin{
    @Override
    public void getDescription() {
        System.out.println("This is a bronze coin.");
    }
}
