package com.company.models.Bridge;

public class FlyingEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("FlyingEnchantment activated");
    }

    @Override
    public void apply() {
        System.out.println("FlyingEnchantment applied");
    }

    @Override
    public void onDeactivate() {
        System.out.println("FlyingEnchantment deactivated");
    }
}
