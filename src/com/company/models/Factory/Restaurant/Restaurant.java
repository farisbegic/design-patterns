package com.company.models.Factory.Restaurant;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.makeBurger();
        return burger;
    }
    public abstract Burger createBurger();
}
