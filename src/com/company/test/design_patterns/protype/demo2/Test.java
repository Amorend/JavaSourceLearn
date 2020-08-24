package com.company.test.design_patterns.protype.demo2;


public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        School school1 = new School();
        school1.setScname("宝鸡大学");
        Student student1 = new Student();
        student1.setAddress("宝鸡市宝光路44号");
        student1.setSchool(school1);
        student1.setZhuanye("计算机学院");
        student1.setName("小明");

        Student student2 = (Student)student1.clone();
        student2.setName("小华");


        System.out.println(student1);
        System.out.println(student2);
        System.out.println("===================");
        //只修改了student2 的学校
        School school2 = student2.getSchool();
        school2.setScname("宝文理");
        //再次打印 查询效果
        System.out.println(student1);
        System.out.println(student2);
    }
}
