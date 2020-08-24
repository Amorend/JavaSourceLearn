package com.company.test.design_patterns.abstractfactory;

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
