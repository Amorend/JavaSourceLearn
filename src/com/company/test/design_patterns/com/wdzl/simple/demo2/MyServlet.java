package com.company.test.design_patterns.com.wdzl.simple.demo2;

/**
 * 懒汉式单例
 */
public class MyServlet {
    private static MyServlet instance;
    private MyServlet(){
        System.out.println("实例化了");
    }
    public static MyServlet newInstance(){
        if(instance==null){
            instance = new MyServlet();
        }
        return instance;
    }
}
