package com.company.test.design_patterns.simplefactroy.demo2;

import com.company.test.design_patterns.simplefactroy.demo1.Drink;

public class Test {
    public static void main(String[] args) {
        Drink drink = DrinkFactory.getDrink("com.wdzl.simplefactroy.demo1.AppleDrink");
        drink.drink();
    }
}
