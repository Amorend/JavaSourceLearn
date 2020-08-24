package com.company.test.design_patterns.decorator.demo1;

public class FlyCar implements ICar {
    @Override
    public void run() {
        System.out.println("===跑车===");
    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {
        System.out.println("===飞车=====");
    }
}
