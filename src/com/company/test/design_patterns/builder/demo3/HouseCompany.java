package com.company.test.design_patterns.builder.demo3;

import com.wdzl.builder.demo1.House;
import com.wdzl.builder.demo2.HouseBuilder;

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
