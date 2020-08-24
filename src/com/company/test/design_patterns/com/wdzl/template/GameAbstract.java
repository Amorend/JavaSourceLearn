package com.company.test.design_patterns.com.wdzl.template;

/**
 * 游戏抽象
 */
public abstract class GameAbstract {
    protected abstract   void initReource();
    protected abstract   void draw();
    protected abstract   void logic();
    protected abstract   void releaseReource();

    protected void run(){
        initReource();
        logic();
        draw();
        releaseReource();
    }
}
