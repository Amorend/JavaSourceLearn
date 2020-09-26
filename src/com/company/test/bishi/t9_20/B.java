package com.company.test.bishi.t9_20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class Something
{
    public static void main(String[] args)
    {
        Other o = new Other();
        new Something().addOne(o);
    }
    public void addOne(final Other o)
    {
        o.i++;
    }
}
class Other
{
    public int i;
}
public class B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        input = br.readLine().split(" ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i+=2) {
            if (i +1 == n)break;
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append(arr[i]);
            buffer.append(" ");
        }
        System.out.println(buffer.toString().trim());
    }
}
