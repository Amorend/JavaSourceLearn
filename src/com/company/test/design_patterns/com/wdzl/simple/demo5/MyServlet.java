package com.company.test.design_patterns.com.wdzl.simple.demo5;

/**
 * 懒汉式单例
 * 多线程下，保证单例的。
 */
public class MyServlet {
    private static MyServlet instance;
    private MyServlet(){
        System.out.println("实例化了");
    }

    static{
        System.out.println("=====MyServlet static 块=====");
    }

    private  static class Inner{
        static{
            System.out.println("========内部类static块======");
        }
        private final static MyServlet INSTANCE = new MyServlet();
    }

    public  static MyServlet newInstance(){
        return Inner.INSTANCE;
    }
}
