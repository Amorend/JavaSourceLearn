package com.company.test.static_test;

public class Test01 {

}
class B
{
    public static B t1 = new B();
    static
    {
        System.out.println("��̬��");
    }
    public static B t2 = new B();
    public static void a(){
        System.out.println("aaa");
    }
    {
        System.out.println("�����");
    }

    public static void main(String[] args)
    {
        B t = new B();
    }
}