package com.company.test.bishi.t10_24;

import java.util.Scanner;
import java.util.TreeSet;

public class A {
    static boolean a(int n[]){

        if(n.length < 5 || n.length > 5)return false;
        int num = 0;
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i]==0)num++;
            else s.add(n[i]);
        }
        if (num>4)return false;
        if ((num + s.size())!=5)return false;
        if (s.last() - s.first()<5)return true;
        if (s.last()>13|| s.first()<0)return false;
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        String ss = s.next();
        String[] sss = ss.split(",");
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(sss[i]);
        }
        System.out.println(a(a));
    }
    static boolean b(int n[]){
        int[] d = new int[14];
        d[0] = -5;
        int len = n.length;
        int max = -1;
        int min = 14;
        for (int i = 0; i < len; i++) {
            d[n[i]]++;
            if(n[i]==0)continue;
            if (d[n[i]]>1)return false;
            if (n[i]>max)max = n[i];
            if (n[i]<min)min = n[i];
        }
        if (max - min<5)return true;
        return false;
    }
}
