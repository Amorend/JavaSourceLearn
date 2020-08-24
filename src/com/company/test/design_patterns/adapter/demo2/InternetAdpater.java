package com.company.test.design_patterns.adapter.demo2;

/**
 * 适配器 ：能让电脑使用
 * 通过继承方式来实现的
 */
public class InternetAdpater extends InternetProduct implements IUsb {

    @Override
    public void usb() {
        System.out.println("在使用USB 做:");
        super.connect();
    }
}
