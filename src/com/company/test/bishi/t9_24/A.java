package com.company.test.bishi.t9_24;

public class A {
}
class Example {
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('i'); foo('j') && (i < 2); foo('k')) {
            i++;
            foo('l');
        }
    }
}