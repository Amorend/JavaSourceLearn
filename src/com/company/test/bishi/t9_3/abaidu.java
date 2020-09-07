package com.company.test.bishi.t9_3;

import java.util.Scanner;

public class abaidu {
    public static void main(String[] args) {

    }
    public static int main() {
        Scanner s = new Scanner(System.in);
        int end = 0;
        int nums = s.nextInt();
        if (nums<1){
            return -1;
        }
        int sum[] = new int[nums];
        for (int i = 0; i < nums; i++) {
            sum[i] = s.nextInt();
            if (sum[i]!=0||sum[i]!=5){
                return -1;
            }
            if (sum[i]==0){
                end += 1; //输入了几个0
            }
        }
        if (end<=0){
            return -1;  //输入的没有0
        }



        return end;
    }
}
