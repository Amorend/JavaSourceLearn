package com.company.test.design_patterns.com.wdzl.simple.demo5;

public class Test {
    public static void main(String[] args) {
//        try {
//            Class.forName("com.wdzl.simple.demo5.MyServlet");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        MyServlet myServlet = null;
//
//        System.out.println(MyServlet.class);

        MyServlet instance = MyServlet.newInstance();
        instance = MyServlet.newInstance();
    }
}
