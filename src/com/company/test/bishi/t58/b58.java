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

            x = Math.sqrt(i + q);/*xΪ����100�󿪷��Ľ��*/
            y = Math.sqrt(i + w);/*yΪ�ټ���168�󿪷��Ľ��*/
            if (x == (int) x && y == (int)y) {
                System.out.println((i));
            }
        }
    }
}
