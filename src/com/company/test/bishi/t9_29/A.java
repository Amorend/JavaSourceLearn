package com.company.test.bishi.t9_29;

public class A {
    static int taxi;
    static int bus;
    public static int qiongju(int head, int foot) {
        int j, t, re;   //re标识符
        re = 0;
        for (j = 0; j < head; j++) {  //循环
            t = head - j;
            if (foot == t * 10 + j * 4) {
                re = 1;
                taxi = j;             // 35 = t + j;
                bus = t;              // 94 = t*4 + j*2;
            }
        }
        return re;
    }
    public static void main(String[] args) {
        int zz = qiongju(10, 94);
        if (zz == 1) {
            System.out.println(taxi);
            System.out.println(bus);
        } else {
            System.out.println("无法求解");
        }
    }
}
