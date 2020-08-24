package com.company.test.design_patterns.com.wdzl.protype.demo1;

/**
 * 原型模式
 * 克隆：
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student();
        student1.setAddress("宝鸡市宝光路44号");
        student1.setSchool("宝鸡大学");
        student1.setZhuanye("计算机学院");
        student1.setName("小明");

        //通过student1 克隆一份
        Student student2 = (Student) student1.clone();
        System.out.println(student2);
        student2.setName("小华");

        System.out.println(student1);
        System.out.println(student2);
    }
}
