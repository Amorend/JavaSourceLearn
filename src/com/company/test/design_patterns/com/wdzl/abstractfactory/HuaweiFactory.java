package com.company.test.design_patterns.com.wdzl.abstractfactory;

import sun.plugin2.gluegen.runtime.CPU;

public class HuaweiFactory implements IPhoneFactory {
    private ICpu cpu;
    private IMomery momery;
    @Override
    public ICpu getCpu() {
        cpu =  new HuaCpu();
        return cpu;
    }

    @Override
    public IMomery getMomery() {
        momery = new HuaWeiMomery();
//        momery.setCpu(cpu);
        return momery;
    }
}
