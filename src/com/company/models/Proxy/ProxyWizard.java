package com.company.models.Proxy;

public class ProxyWizard {
    private String name;

    public ProxyWizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
