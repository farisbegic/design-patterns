package com.company.models.Observer;

import java.util.ArrayList;

public class Weather {
    private WeatherType currentWeather;
    private ArrayList<WeatherObserver> weatherObservers;

    public Weather() {
        weatherObservers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObservers(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    public void notifyObservers() {
        for (WeatherObserver wo : weatherObservers) {
            wo.update(currentWeather);
        }
    }

    public void timePasses() {
        var values = WeatherType.values();
        currentWeather = values[currentWeather.ordinal() + 1 % WeatherType.values().length];
        System.out.println("The weather has changed to " + currentWeather);
        notifyObservers();
    }
}
