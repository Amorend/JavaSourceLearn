package com.company.test.design_patterns.simple.demo4;

/**
 * 懒汉式单例
 * 多线程下，保证单例的。
 */
public class MyServlet {
    private static MyServlet instance;
    private MyServlet(){
        System.out.println("实例化了");
    }

    /**
     * 双重检查
     */
    public  static MyServlet newInstance(){
        if(instance==null){
            synchronized (MyServlet.class) {
                if(instance==null){
                    instance = new MyServlet();
                }
            }
        }
        return instance;
    }
}
