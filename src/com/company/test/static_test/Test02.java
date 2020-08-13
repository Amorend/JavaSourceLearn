package com.company.test.static_test;

public class Test02 {

    public static void main(String[] args) {
        new A4();
    }
}
class A1 {
    A1(){
        System.out.println("A1");
    }
}
class A2 extends A1{
    A2(){
        System.out.println("A2");
    }
}
class A3 extends A2{
    B1 b = new B2();
    A3(){
        System.out.println("A3");
    }
//    A2 a = new A2();
}
class A4 extends A3{
    A4(){
        System.out.println("A4");
    }
}
class B1{
    B1(){
        System.out.println("B1");
    }
}
class B2 extends B1{
    B2(){
        System.out.println("B2");
    }
}