package com.company.test.bishi.t9_26;

import java.util.Scanner;

class Main2 {

    public static void main(String[] args) {
        System.out.println(3 << 2 & 0x01);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        changeCase(str);
    }

    public static void changeCase(String str) {
        char[] a = str.toCharArray();//将字符串转为字符数组
        int i = 0, j = 0, l = 0, k = 0;
        k = a.length - 1;
        char[] c = new char[k];

        if (i == 0) //截取首尾非空格的字符部分
        {
            for (j = 0; a[j] == '_'; j++) ; //扫描字符串首
            for (; a[k] == '_'; k--) ;//扫描字符串尾
        }

        for (l = 0, i = j; i <= k; i++) {
            if (a[i] == '_' && a[i + 1] == '_') ;
                //如果当前是空格，并且下一个也是空格，则不把当前元素放入新的字符串
            else
                c[l++] = a[i];//仅当前是空格或当前是有效元素，把数据放入新的字符串
        }
        System.out.println(c);
        
    }
}

class Main {
    private static int m;
    private static int n;
    private static int[][] mat;
    private static int[][] dp;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        mat = new int[m][n];
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        dp[m - 1][n - 1] = mat[m - 1][n - 1];
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = mat[i][n - 1] + dp[i + 1][n - 1];
        }
        for (int j = n - 2; j >= 0; j--) {
            dp[m - 1][j] = mat[m - 1][j] + dp[m - 1][j + 1];
        }

        int i = m - 2;
        int j = n - 2;
        while (true) {
            int tempI = i;
            int tempJ = j;
            for (tempI = i; tempI >= 0; tempI--) {
                dp[tempI][tempJ] = mat[tempI][tempJ] + Math.max(dp[tempI][tempJ + 1], dp[tempI + 1][tempJ]);
            }
            tempI = i;
            tempJ = j;
            for (tempJ = i; tempJ >= 0; tempJ--) {
                dp[tempI][tempJ] = mat[tempI][tempJ] + Math.max(dp[tempI][tempJ + 1], dp[tempI + 1][tempJ]);
            }
            if (i == 0 && j == 0) {
                break;
            }

            if (i != 0) {
                i--;
            }
            if (j != 0) {
                j--;
            }
        }
        System.out.println(dp[0][0]);
    }

}

public class D {
    static int findMaxPath(int mat[][]) {

        int N = mat.length; //表示矩阵的行数
        int M = mat[0].length; //表示矩阵的列数

        // 初始化返回值 result = -1
        int result = -1;

        for (int i = 0; i < M; i++) {
            result = Math.max(result, mat[0][i]);
        }

        for (int i = 1; i < N; i++) {
            result = -1;
            for (int j = 0; j < M; j++) {
                // When all paths are possible
                if (j > 0 && j < M - 1) {
                    mat[i][j] += Math.max(mat[i - 1][j], Math.max(mat[i - 1][j - 1], mat[i - 1][j + 1]));
                } else if (j > 0) {
                    mat[i][j] += Math.max(mat[i - 1][j], mat[i - 1][j - 1]);
                } else if (j < M - 1) {
                    mat[i][j] += Math.max(mat[i - 1][j], mat[i - 1][j + 1]);
                }

                // 得到返回值result。返回值应该是 mat[i][j]与result中较大者。
                result = Math.max(mat[i][j], result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{2, 1, 1}, {3, 5, 1}, {4, 2, 1}};
        int mat[][] = {
                {10, 10, 2, 0, 20, 4},
                {1, 0, 0, 30, 2, 5},
                {0, 10, 4, 0, 2, 0},
                {1, 0, 2, 20, 0, 4}
        };

        System.out.println(findMaxPath(arr));
    }

}
