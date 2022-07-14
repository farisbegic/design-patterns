package com.company.models.Factory.Restaurant;

public class VeggieRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
