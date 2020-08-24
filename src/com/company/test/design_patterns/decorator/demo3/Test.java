package com.company.test.design_patterns.decorator.demo3;


public class Test {
    public static void main(String[] args) {
        ICar car = new Jeep();
//        car.run();

        FlyDecoratorCar flyDecoratorCar = new FlyDecoratorCar(car);
//        flyDecoratorCar.run();

        SwimDecoratorCar swimDecoratorCar = new SwimDecoratorCar(flyDecoratorCar);
        swimDecoratorCar.swim();
    }
}
