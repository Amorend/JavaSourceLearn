package com.company.test.design_patterns.com.wdzl.factory;

public class AppleFactory implements IDrinkFactory {

    @Override
    public Drink getDrink() {
        return new AppleDrink();
    }
}
