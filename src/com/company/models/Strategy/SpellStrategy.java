package com.company.models.Strategy;

public class SpellStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("Spell strategy");
    }
}
