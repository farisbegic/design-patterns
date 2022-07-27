package com.company.models.Strategy;

public class DragonSlayer {
    private DragonSlayingStrategy dragonSlayingStrategy;

    public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void changeStrategy(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void execute() {
        dragonSlayingStrategy.execute();
    }
}
