package com.company.test.design_patterns.com.wdzl.simplefactroy.demo2;

import com.wdzl.simplefactroy.demo1.AppleDrink;
import com.wdzl.simplefactroy.demo1.Drink;

public class Test {
    public static void main(String[] args) {
        Drink drink = DrinkFactory.getDrink("com.wdzl.simplefactroy.demo1.AppleDrink");
        drink.drink();
    }
}
