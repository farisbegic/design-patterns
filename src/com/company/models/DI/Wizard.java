package com.company.models.DI;

public class Wizard {
    Tobacco tobacco;

    public Wizard(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    public void smoke() {
        tobacco.smoke(this);
    }
}
