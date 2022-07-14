package com.company.models.Memento.Star;

public class Star {
    private StarType type;
    private int age;
    private int mass;

    public Star(StarType type, int age, int mass) {
        this.type = type;
        this.age = age;
        this.mass = mass;
    }

    public void timePasses() {
        age *= 2;
        mass *= 8;

        switch (type) {
            case RED_GIANT:
                type = StarType.WHITE_DWARF;
                break;
            case SUN:
                type = StarType.RED_GIANT;
                break;
            case SUPERNOVA:
                type = StarType.DEAD;
                break;
            case WHITE_DWARF:
                type = StarType.SUPERNOVA;
                break;
            case DEAD:
                age *= 2;
                mass = 0;
                break;
            default:
                break;
        }
    }

    public StarMementoInternal getMemento() {
        var state = new StarMementoInternal();
        state.setAge(age);
        state.setMass(mass);
        state.setType(type);
        return state;
    }

    public void setMemento (StarMementoInternal memento) {
        age = memento.getAge();
        mass = memento.getMass();
        type = memento.getType();
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type.toString(), age, mass);
    }
}
