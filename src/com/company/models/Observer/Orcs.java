package com.company.models.Observer;

public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println(Orcs.class.getSimpleName() + " are facing " + weatherType);
    }
}
