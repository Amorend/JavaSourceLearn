package com.company.test.design_patterns.com.wdzl.builder.demo2;

import com.wdzl.builder.demo1.House;

public class Test {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.ceil();
        houseBuilder.floor();
        houseBuilder.wall();

        House house = houseBuilder.getHouse();
        System.out.println(house);

    }
}
