package com.company.test.design_patterns.com.wdzl.template;

public class PlaneGame extends GameAbstract {
    @Override
    protected void initReource() {
        System.out.println("======初始化加载射击游戏素材=====");
    }

    @Override
    protected void draw() {
        System.out.println("======绘制地图射击游戏素材=====");
    }

    @Override
    protected void logic() {
        System.out.println("======射击游戏逻辑=====");
    }

    @Override
    protected void releaseReource() {
        System.out.println("======射击游戏释放资源=====");
    }

}
