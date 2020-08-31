package com.company.test.bishi.t58;

import java.util.Scanner;

public class b58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int w = s.nextInt();
        int i ;
        double x, y;
        for (i = 1; i < 500; i++) {

            x = Math.sqrt(i + q);/*x为加上100后开方的结果*/
            y = Math.sqrt(i + w);/*y为再加上168后开方的结果*/
            if (x == (int) x && y == (int)y) {
                System.out.println((i));
            }
        }
    }
}
