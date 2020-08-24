package com.company.test.design_patterns.com.wdzl.factory;

public class OrangeFactory implements IDrinkFactory {
    @Override
    public Drink getDrink() {
        return new OrangeDrink();
    }
}
