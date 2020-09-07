package com.company.test.bishi.t9_6;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        Integer j = 100;
        System.out.println(i == j);
        System.out.println(threeSumClosest(new int[]{2, 1, -2, 3}, 5));
    }

        public static int threeSumClosest(int[] nums, int target) {
            // ����
            Arrays.sort(nums);
            int closestNum = nums[0] + nums[1] + nums[2];
            for (int i = 0; i < nums.length - 2; i++) {
                int l = i + 1, r = nums.length - 1;
                while (l < r){
                    int threeSum = nums[l] + nums[r] + nums[i];
                    if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                        closestNum = threeSum;
                    }
                    if (threeSum > target) {
                        r--;
                    } else if (threeSum < target) {
                        l++;
                    } else {
                        // ����Ѿ�����target�Ļ�, �϶�����ӽ���
                        return target;
                    }
                }
            }
            return closestNum;
        }
    }

