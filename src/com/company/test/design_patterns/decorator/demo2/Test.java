package com.company.test.design_patterns.decorator.demo2;


public class Test {
    public static void main(String[] args) {
        ICar car = new Jeep();
//        car.run();

        FlyDecoratorCar flyDecoratorCar = new FlyDecoratorCar(car);
        flyDecoratorCar.show();
    }
}
