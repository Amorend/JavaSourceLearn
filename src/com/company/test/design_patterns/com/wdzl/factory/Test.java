package com.company.test.design_patterns.com.wdzl.factory;

public class Test {
    public static void main(String[] args) {
        IDrinkFactory drinkFactory = new OrangeFactory();
        Drink drink = drinkFactory.getDrink();
        drink.drink();;
    }
}
