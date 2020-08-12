package com.company.test.static_test;

public class Test01 {

}
 class Threads4{
    public static void main(String[] args){
        new Threads4().go();
    }
    public void go(){
        Runnable r=new Runnable(){
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}



class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
class Z extends X{
    Q q = new Q();
    static Q qq = new Q();
    Y y=new Y();
    {
        System.out.println("{}");
    }
    static {
        System.out.println("static");
    }
    public Z(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}
class Q{
    static int a;
    Q(){
        System.out.println("q");
        a++;
        System.out.println(a);
    }
}
class B
{
    public static B t1 = new B();
    static
    {
        System.out.println("¾²Ì¬¿é");
    }
    public static B t2 = new B();
    public static void a(){
        System.out.println("aaa");
    }
    {
        System.out.println("¹¹Ôì¿é");
    }

    public static void main(String[] args)
    {
        B t = new B();
    }
}