package com.company.test.design_patterns.adapter.demo2;

public class InternetProduct implements INetWork {
    @Override
    public void connect() {
        System.out.println("正在上网！");
    }
}
