package com.company.test.bishi.t10_19;

import java.util.*;

public class B {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = Arrays.copyOfRange(a,0,a.length);
        Arrays.sort(b);
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int min = b[i];
            int max = b[i+1];
            int minNum = -1;
            int maxNum = -1;
            for (int j = 0; j < a.length; j++) {
                if (a[j]==min)minNum = i;
                if (a[j]==max)maxNum = i;
                if (minNum!=-1&&maxNum!=-1){
                    break;
                }
            }
            System.out.println(b[i]+minNum+b[i+1]+maxNum);
            if (maxNum<minNum){
                count++;
                int[] aa = Arrays.copyOfRange(a,0,maxNum);
                int[] ab = Arrays.copyOfRange(a,maxNum+1,a.length);
                for (int j = 0; j < aa.length; j++) {
                    System.out.println(aa[j]);
                }
                System.out.println();
                for (int j = 0; j < aa.length; j++) {
                    System.out.println(ab[j]);
                }
                System.out.println();
                int[] ac = {b[i+1]};
                System.arraycopy(ab,0,a,aa.length,ab.length);
                System.arraycopy(ac,0,a,aa.length+ab.length,ac.length);
                for (int j = 0; j < a.length; j++) {
                    System.out.println(a[j]);
                }
                System.out.println();
            }
        }
        System.out.println(count);
    }
}
