package com.company.test.design_patterns.com.wdzl.simple.demo1;

/**
 * 单例 内存实例
 * 1.构造方法私有化
 * 2.声明本类static实例
 *
 * 实例化时机分为：饿汉式和懒汉式
 * 饿汉式：缺点，不能延时加载。
 */
public class ConfigParse {
    private static ConfigParse instance = new ConfigParse();
    private ConfigParse(){
        System.out.println("====构造了======");
    }
    public static ConfigParse newIntance(){
        return instance;
    }
}
