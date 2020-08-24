package com.company.test.design_patterns.com.wdzl.builder.demo1;

public class Test {
    public static void main(String[] args) {
        House house = new House();
        house.ceil("白色");
        house.floor("棕色");
        house.wall("粉色");
        System.out.println(house);

    }
}
