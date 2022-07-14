package com.company.models.Prototype;

public class Car extends Vehicle{
    private String seats;

    public Car(Car car) {
        super(car);
        this.seats = car.seats;
    }

    public Car(String brand, String model, String color, String seats) {
        super(brand, model, color);
        this.seats = seats;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats='" + seats + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
