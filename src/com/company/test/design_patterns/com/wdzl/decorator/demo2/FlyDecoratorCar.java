package com.company.test.design_patterns.com.wdzl.decorator.demo2;

/**
 * 装饰飞功能
 */
public class FlyDecoratorCar {
    private ICar car;
    public FlyDecoratorCar(ICar car){
        this.car = car;
    }
    public void run(){
        car.run();
    }

    public void fly(){
        System.out.println(car+"====在飞====");
    }

    public void show(){
        run();
        fly();
    }
}
