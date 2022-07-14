package com.company.models.Builder;

public final class Hero {
    private final String name;
    private final String power;
    private final int health;

    public Hero(HeroBuilder heroBuilder) {
        this.name = heroBuilder.name;
        this.power = heroBuilder.power;
        this.health = heroBuilder.health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", health=" + health +
                '}';
    }

    public static class HeroBuilder {
        private final String name;
        private String power;
        private int health;

        public HeroBuilder(String name) {
            this.name = name;
        }

        public HeroBuilder power (String power) {
            this.power = power;
            return this;
        }

        public HeroBuilder health (int health) {
            this.health = health;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
