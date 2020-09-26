package com.company.test.bishi.t9_15;

import java.util.Arrays;

public class a {
    static void moveright(int[] nums,int k){
        int temp ,p;
        for (int i = 0; i < k; i++) {
            p = nums[nums.length -1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = p;
                p = temp;
            }
        }
        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args) {
        int a[] = {1,2,3};
        moveright(a,2);
    }
    }




class Solution {
    /**
     * 数组内数据循环平移
     * @param arr int整型一维数组 输入数组
     * @param pushOffset int整型 位移长度
     * @return int整型一维数组
     */
    public static int[] pushIntArray (int[] nums, int k) {
        // write code here

        int temp ,p;
        for (int i = 0; i < k; i++) {
            p = nums[nums.length -1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = p;
                p = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;

    }

    public static void main(String[] args) {
        Solution a = new Solution();
        int aa[] = new int[]{1,2,3};
         pushIntArray(aa,2);
    }
}