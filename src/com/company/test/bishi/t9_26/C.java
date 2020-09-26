package com.company.test.bishi.t9_26;

public class C {
    public static void main(String[] args) {
        String a = g("1A2C3D4B56","B1D23CA45B6A");
        if (a ==null||"".equals(a)){
            System.out.println("-1");
        }else {
            System.out.println(a);
        }
    }
    static String g(String s1,String s2){
        String max = null;
        String min = null;
        max = s1.length()>s2.length()?s1:s2;
        min = s1.equals(max)?s2:s1;
        int minlen = min.length();
        if (max.contains(min)){
            return min;
        }
        for (int i = 0; i < minlen; i++) {
            for (int st = 0,end = minlen-i; end<=minlen;st++,st++) {
                String temp = min.substring(st, end);
                if (max.contains(temp)) {
                    return temp;
                }
            }
        }
        return null;
    }
}
