package com.company.test.classloader;

public class Text01 {
    public static void main(String[] args) {
        String [] arr = new String[10];
        String str = "";
        System.out.println(arr.getClass()); // 数组的String 类
        System.out.println(str.getClass()); // 非数组的String 类
        System.out.println(arr.getClass().getComponentType()); // String类
        System.out.println(str.getClass().getComponentType()); // 得到null值，因为str不是数组
        System.out.println(arr.getClass().getComponentType().isPrimitive()); // 显示false，因为String 不是基本数据类型

        int [] arr1 = new int[10];
        System.out.println(arr1.getClass().getComponentType().isPrimitive()); // 显示true，因为int是基本数据类型
    }
}
