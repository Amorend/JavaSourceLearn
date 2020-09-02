package com.company.test.bishi.t9_2;

public class a {
    public static void main(String[] args) {
        System.out.println(getNum(1));
        System.out.println(getNum(2));
        System.out.println(getNum(3));
        System.out.println(getNum(4));
        System.out.println(getNum(5));
        System.out.println(getNum(6));
        System.out.println(getNum(7));
    }

    static int getNum(int level){
        if (level ==1){
            return 1;
        }
        int a = 0;
        if (level>2){
            double d = 2.5*getNum(level - 1);
            if(d>(int)d){
                a = (int)d+1;
            }else {
                a = (int) d;
            }
        }
        if (level == 2 ){
        return (int)Math.pow(3,level-1);
        }
        return a;
    }
}
