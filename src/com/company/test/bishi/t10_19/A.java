package com.company.test.bishi.t10_19;

public class A {
    public static void main(String[] args) {
        String a[] = {"6","-3","-2","7","-15","1","2","2"};
        A aa = new A();
        System.out.println(aa.findGreatestSumOfSubArray(a));
    }
    public int findGreatestSumOfSubArray (String[] array) {
        // write code here

        int size = array.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + Integer.parseInt(array[i]);
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if (max_ending_here<0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
