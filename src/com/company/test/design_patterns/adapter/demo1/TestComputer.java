package com.company.test.design_patterns.adapter.demo1;

/**
 * 适配器模式：解决两个接口不一致的情况
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        InternetProduct internetProduct = new InternetProduct();

        InternetAdpater adpater = new InternetAdpater(internetProduct);

//        computer.setUsb(internetProduct);// 报错，接口不一致
        computer.setUsb(adpater); //在电脑上连接的是适配器

        computer.work();
    }
}
