package com.company.test.design_patterns.com.wdzl.decorator.demo1;

public class Test {
    public static void main(String[] args) {
        ICar jeep = new Jeep();
        jeep.run();
        jeep.fly();
    }
}
