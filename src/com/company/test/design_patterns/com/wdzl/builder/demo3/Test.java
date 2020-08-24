package com.company.test.design_patterns.com.wdzl.builder.demo3;

import com.wdzl.builder.demo1.House;

/**
 * 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        HouseCompany houseCompany = new HouseCompany();
        houseCompany.builder();
        House house = houseCompany.getHouse();
        System.out.println(house);
    }
}
