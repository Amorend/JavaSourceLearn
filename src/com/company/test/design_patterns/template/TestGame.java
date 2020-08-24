package com.company.test.design_patterns.template;

public class TestGame {
    public static void main(String[] args) {
        GameAbstract game1 = new PlaneGame();
        game1.run();
    }
}
