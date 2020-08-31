package com.company.test.bishi.t4399;

import java.util.HashSet;
import java.util.Set;

public class a4399 {
    public static void main(String[] args) {
        int a[] = {2,7,11,12};
        int[] s = twoSum1(a, 18);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static int[] twoSum1(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s < target) i++;
            else if(s > target) j--;
            else return new int[] { nums[i], nums[j] };
        }
        return new int[0];
    }


    public static int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left < right) {

            int cur = nums[left] + nums[right];

            if (cur == target)
                return new int[]{nums[left], nums[right]};
            else if (cur > target)
                right--;
            else
                left++;
        }

        return new int[]{};
    }




















    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
