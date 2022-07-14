package com.company.models.Bridge;

public class Axe implements Weapon{
    public Enchantment enchantment;

    public Axe(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println(Axe.class.getSimpleName() + " is wielded");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println(Axe.class.getSimpleName() + " is swung");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println(Axe.class.getSimpleName() + " is unwielded");
        enchantment.onDeactivate();
    }
}
