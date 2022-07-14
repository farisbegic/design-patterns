package com.company.models.Memento.Star;

public class StarMementoInternal {
    private StarType type;
    private int age;
    private int mass;

    public StarType getType() {
        return type;
    }

    public void setType(StarType type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type.toString(), age, mass);
    }
}
