package com.company.test.bishi.t9_26;

import java.util.*;

public class A {
    static boolean isC(int[] nums){
        if(nums.length==0||nums==null){
            return false;
        }
        int count = 0;
        List l = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count++;
            }else {
                l.add(nums[i]);
            }
        }
        Collections.sort(l);
        if (count == 0){
            int c = 0;
            int[] a = nums;
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                if(a[i] - a[i - 1] == 1){
                    c++;
                }
                if(c==4){
                    return true;
                }
            }
        }
        if(count ==4) return true;
        if (count ==3){
            int a = (int) l.get(0);
            int b = (int) l.get(1);
            if (Math.abs(a-b)<=4&&Math.abs(a-b)>0){
                return true;
            }
        }
        if (count ==2||count==1){
            int c1 = 0;
            int c2 = 0;
            for (int i = 1; i < l.size(); i++) {
                int a = (int) l.get(i);
                int b = (int) l.get(i-1);
                if (a-b==1){
                    c1++;
                }
                if (a-b == 2){
                    c2++;
                }
            }
            if (count ==2){
                if (c1==2||c2==2){
                    return true;
                }
            }else {
                if(c1 ==2&&c2==1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(isC(arr));
    }
}
