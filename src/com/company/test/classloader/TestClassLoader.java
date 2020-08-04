package com.company.test.classloader;

public class TestClassLoader {

    public static void main(String[] args) {
        System.out.println(TestClassLoader.class.getResource("huashan.xml"));
        String a = "";
        if(a.equals("")){

        }
//        System.out.println(TestClassLoader.class.getResource("/huashan.xml"));
//        System.out.println("------------------");
//        System.out.println(TestClassLoader.class.getClassLoader().getResource("huashan.xml"));
//        System.out.println(TestClassLoader.class.getClassLoader().getResource("/huashan.xml"));
    }
}
