package com.company.models.Factory.Restaurant;

public class VeggieBurger implements Burger{
    @Override
    public void makeBurger() {
        System.out.println("Veggie Burger");
    }
}
