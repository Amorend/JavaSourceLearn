package com.company.test.design_patterns.factory;

public class OrangeFactory implements IDrinkFactory {
    @Override
    public Drink getDrink() {
        return new OrangeDrink();
    }
}
