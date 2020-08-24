package com.company.test.design_patterns.decorator.demo1;

public class Test {
    public static void main(String[] args) {
        ICar jeep = new Jeep();
        jeep.run();
        jeep.fly();
    }
}
