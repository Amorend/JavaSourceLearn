package com.company.test.bishi.t9_18;

public class A {
    static int[] flag = new int[100];
    static int index = 0;
    static void num(int arr[],int start,int length,int sum){
        if(sum == 0){
            for (int j = 0; j < index; j++) {
                System.out.println(flag[j]+"   "+index);
            }
            System.out.println();
        }else{
            for (int i = 0; i < start; i++) {
                flag[index++] = arr[i];
                
            }
        }
    }
}
