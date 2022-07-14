package com.company.models.Factory.Coin;

public class CoinFactory {
    public static Coin getCoin(CoinType coinType) {
        return coinType.getConstructor().get();
    }
}
