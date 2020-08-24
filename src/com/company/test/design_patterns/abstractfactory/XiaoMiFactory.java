package com.company.test.design_patterns.abstractfactory;

public class XiaoMiFactory implements IPhoneFactory {
    @Override
    public ICpu getCpu() {
        return new XiaomiCpu();
    }

    @Override
    public IMomery getMomery() {
        return new XiaoMiMomery();
    }
}
