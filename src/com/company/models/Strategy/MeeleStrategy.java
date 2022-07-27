package com.company.models.Strategy;

public class MeeleStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("Meele strategy");
    }
}
