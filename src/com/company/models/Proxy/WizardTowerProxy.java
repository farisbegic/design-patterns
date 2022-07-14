package com.company.models.Proxy;

public class WizardTowerProxy implements WizardTower{
    private WizardTower wizardTower;
    private int max_wizards = 3;
    private int no_wizards;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
        this.no_wizards = 0;
    }

    @Override
    public void enter(ProxyWizard proxyWizard) {
        if (no_wizards < max_wizards) {
            wizardTower.enter(proxyWizard);
            no_wizards++;
        } else {
            System.out.println("Wizard tower is full");
        }
    }
}
