package com.company.test.design_patterns.template;

public class TowerGame extends GameAbstract {
    @Override
    protected void initReource() {
        System.out.println("===加载塔防游戏的图像资源===");
    }

    @Override
    protected void draw() {
        System.out.println("===绘制塔防游戏地图及素材===");
    }

    @Override
    protected void logic() {
        System.out.println("===塔防游戏的逻辑===");
    }

    @Override
    protected void releaseReource() {
        System.out.println("===塔防游戏的资源释放==");
    }
}
