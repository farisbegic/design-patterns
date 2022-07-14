package com.company.models.Proxy;

public class MagicTower implements WizardTower{
    @Override
    public void enter(ProxyWizard proxyWizard) {
        System.out.println(proxyWizard + " has entered " + MagicTower.class.getSimpleName());
    }
}
