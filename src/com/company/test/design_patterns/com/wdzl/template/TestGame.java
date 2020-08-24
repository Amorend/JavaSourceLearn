package com.company.test.design_patterns.com.wdzl.template;

public class TestGame {
    public static void main(String[] args) {
        GameAbstract game1 = new PlaneGame();
        game1.run();
    }
}
