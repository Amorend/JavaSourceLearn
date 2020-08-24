package com.company.test.design_patterns.abstractfactory;

public class Test {
    public static void main(String[] args) {
        IPhoneFactory factory = new HuaweiFactory();
        ICpu cpu = factory.getCpu();
        cpu.run();

        IMomery momery = factory.getMomery();
        momery.use();
    }
}
