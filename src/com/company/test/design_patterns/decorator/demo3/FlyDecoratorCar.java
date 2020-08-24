package com.company.test.design_patterns.decorator.demo3;

/**
 * 装饰飞功能
 */
public class FlyDecoratorCar implements ICar {
    private ICar car;
    public FlyDecoratorCar(ICar car){
        this.car = car;
    }
    public void run(){
        car.run();
        this.fly();
    }

    public void fly(){
        System.out.println(car+"====在飞====");
    }

    public void show(){
        run();
        fly();
    }
}
