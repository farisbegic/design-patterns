package com.company.models.Factory.Coin;

import java.util.function.Supplier;

public enum CoinType {
    GOLD(GoldCoin::new),
    BRONZE(BronzeCoin::new);

    private final Supplier<Coin> constructor;

    CoinType(Supplier<Coin> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Coin> getConstructor() {
        return constructor;
    }
}
