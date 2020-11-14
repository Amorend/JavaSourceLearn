package com.company.test.bishi.t10_19;

public class C {
    public static void main(String[] args) {
        String s1 =new String("abc");
        String s2 ="abc";
        String s3 =new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s3 == s1);
        System.out.println(s1.intern() == s1);


    }
    public static void main2(String[] args) {
        outer:for(int i = 0 ; i<3 ; i++)
            inner:for (int j = 0; j < 2; j++) {
                if (j==1)
                    continue outer;
                System.out.println(j+"and"+i);
            }
    }
    public static void main1(String[] args) {
        int c = 0;
        for (int i = 0; i < 10; i++) {
            c = c++;
        }
        System.out.println(c);
    }
}
