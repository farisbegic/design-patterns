package com.company.models.DI;

public abstract class Tobacco {
    public void smoke(Wizard wizard) {
        System.out.println(wizard.getClass().getSimpleName() + " smokes " + this.getClass().getSimpleName());
    }
}

