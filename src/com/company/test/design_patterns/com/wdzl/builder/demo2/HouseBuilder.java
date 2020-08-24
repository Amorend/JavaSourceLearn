package com.company.test.design_patterns.com.wdzl.builder.demo2;

import com.wdzl.builder.demo1.House;

public class HouseBuilder {
    private House house;
    public HouseBuilder(){
        house = new House();
    }
    public void ceil(){
        house.ceil("白色");
    }
    public void floor(){
        house.floor("红色");
    }
    public void wall(){
        house.wall("粉色");
    }

    public House getHouse(){
        return house;
    }
}
