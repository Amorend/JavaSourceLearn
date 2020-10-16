package com.company.test.bishi.t10_16;

import java.util.*;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class A {
    public static Set<String> set = new TreeSet<String>();

    public static void doSet(String start, String[] sourceList, int max) {
        String[] olds = start.split("_");
        if (olds.length == max) {
            set.add(start.replaceAll("_", "").trim());
        } else {
            for (int s = 0; s < sourceList.length; s++) {
                if (Arrays.asList(olds).contains(sourceList[s])) {
                    continue;
                } else {
                    doSet(start + "_" + sourceList[s], sourceList, max);
                }
            }
        }
    }
    public static void doSet(String[] sourceList, int max) {
        for (int start = 0; start < sourceList.length; start++) {
            doSet(sourceList[start], sourceList, max);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] haha = a.split("");
        doSet(haha, 3);
        System.out.println(set.size());
    }
}

