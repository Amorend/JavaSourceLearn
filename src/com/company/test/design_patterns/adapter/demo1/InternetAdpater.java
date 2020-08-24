package com.company.test.design_patterns.adapter.demo1;

/**
 * 适配器 ：能让电脑使用
 */
public class InternetAdpater implements  IUsb {
    //组合了网络接口
    private INetWork netWork;
    public InternetAdpater(INetWork netWork){
        this.netWork = netWork;
    }
    @Override
    public void usb() {
        System.out.println("在使用USB 做:");
        netWork.connect();
    }
}
