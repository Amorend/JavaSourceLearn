package com.company.test.design_patterns.builder.demo3;

import com.company.test.design_patterns.builder.demo1.House;
import com.company.test.design_patterns.builder.demo2.HouseBuilder;


public class HouseCompany {
    private HouseBuilder houseBuilder;
    public HouseCompany(){
        houseBuilder = new HouseBuilder();
    }

    public void builder(){
        houseBuilder.ceil();
        houseBuilder.wall();
        houseBuilder.floor();
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }
}
