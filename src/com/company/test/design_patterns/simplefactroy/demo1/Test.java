package com.company.test.design_patterns.simplefactroy.demo1;

public class Test {
    public static void main(String[] args) {
        Drink drink = DrinkFactory.getDrink(DrinkFactory.DRINK_COCO);
        drink.drink();
    }
}
