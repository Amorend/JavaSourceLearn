package com.company.test.design_patterns.decorator.demo3;

public class SwimDecoratorCar implements ICar {
    private ICar car;
    public SwimDecoratorCar(ICar car){
        this.car = car;
    }
    public void run(){
        car.run();
        this.swim();
    }

    public void swim(){
        System.out.println(car+"====在海里游====");
    }

    public void show(){
        run();
        swim();
    }
}
