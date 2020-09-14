package com.company.test.abstracts;

public interface Inter {
    int a = 1;
    void a();
    static void a1(){

    }
    default void a2(){
        
    }
}
abstract class In implements Inter {
    static final int s = 2;

    public static void main(String[] args) {
//        s = 2;
        System.out.println(s);
    }
}

class A{

}