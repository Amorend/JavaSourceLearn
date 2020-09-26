package com.company.test.bishi.t9_20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Laohu_a {
    static int[] c;
    static int[] p;

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] a = b.readLine().trim().split(" ");
        int n = Integer.parseInt(a[0]);
        int w = Integer.parseInt(a[1]);
        int k = Integer.parseInt(a[2]);

        c = new int[n];
        p = new int[n];
        String[] aa = b.readLine().trim().split(" ");
        String[] aaa = b.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(aa[i]);
            p[i] = Integer.parseInt(aaa[i]);

        }
        b.close();
        PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> (p[o2]-p[o1]));
        PriorityQueue<Integer> min = new PriorityQueue<>((o1, o2) -> (c[o1]-c[o2]));
        for (int i = 0; i < n; i++) {
            if (c[i]>w){
                min.add(i);
            }else {
                max.add(i);
            }
        }
        while (k!=0&&!max.isEmpty()){
            while (!min.isEmpty()&&c[min.peek()]<=w){
                max.offer(min.poll());
            }
            w+=p[max.poll()];
            k--;
        }
        System.out.println(w);
    }
}
class A{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 3, 3, 1, 5, 3};
        paixu(arr);
    }

    private static void paixu(int[] arr) {
        int count = 0;
        List l = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    l.add(arr[j]);
                    count++;
                }
            }
        }
        System.out.println(l);
    }
}
