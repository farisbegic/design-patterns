package com.company.models.Observer;

public class Hobbits implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println(Hobbits.class.getSimpleName() + " are facing " + weatherType);
    }
}
