package com.company.test.design_patterns.adapter.demo1;
//新电脑  没有网线接口的
public class Computer {
    private IUsb usb; //
    public void work(){
        System.out.println("====电脑启动====");
        if(usb!=null){
            usb.usb();
        }
        System.out.println("====电脑关机====");
    }

    public void setUsb(IUsb usb){
        this.usb = usb;
    }
}
