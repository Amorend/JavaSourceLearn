package com.company.test.static_test;

public class Test03 {
    public static void main(String[] args) {
        AA a = new BB();
//        System.out.println(a.b);
//        System.out.println(a.a);
        a.a();

    }
}

class AA{
    static int a = 0;
    int b;
    static void a(){
        System.out.println("AA");
    }
}
class BB extends AA{
    static int a = 2;
    int b = 5;
    static  void a(){
        System.out.println("bb");
    }
}
