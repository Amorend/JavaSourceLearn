package com.company.test.bishi;

import java.util.*;

public class b4399 {

    public static void main(String[] args) {
        String[] s = new String[]{"1"};
        String[] s1 = {"a"};
        int a[] = {1,1,1,2,3,4,5,6,7,7,7,7,8};
//        System.out.println(topKFrequent(a, 2));
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>()
        {
            public int compare(Integer a, Integer b)
            {
                return map.get(a) - map.get(b);
            }
        });
        for (int key : map.keySet())
        {
            if (pq.size() < k)
                pq.add(key);
            else if (map.get(key) > map.get(pq.peek()))
            {
                pq.remove();
                pq.add(key);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty())
        {
            res.add(pq.remove());
        }
        return res;
    }
}
