package com.company.test.bishi.t10_24;
import java.util.*;
public class B {
}



class Solution {


    public static String lcs (String str1, String str2) {
        int[][] dp = new int[str1.length()][str2.length()];
        StringBuilder sb = new StringBuilder();//子序列
        //初始化第一行
        for(int j = 0; j < str2.length(); j++){
            if(str2.charAt(j) == str1.charAt(0))
                while(j < str2.length()){
                    dp[0][j] = 1;
                    j++;
                }
        }
        //第一列
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(0)){
                while(i < str1.length()){
                    dp[i][0] = 1;
                    i++;
                }
            }
        }
        //dp
        for(int i = 1; i < str1.length(); i++){
            for(int j = 1; j < str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    sb.append(str1.charAt(i-1));
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return   LCS_getString(str1,str2,dp);
    }
    private static String LCS_getString(String s1,String s2,int[][] dp){
        StringBuffer sb = new StringBuffer();
        int i =s1.length()-1;
        int j =s2.length()-1;
        while (i>=0 && j>=0){
            if(s1.charAt(i)==s2.charAt(j)){
                sb.append(s1.charAt(i));
                i--;j--;
            }else {
                if(i>0 && j>0&&dp[i][j-1]>=dp[i-1][j])//左边对于上边
                    j--;//继续向左找
                else
                    i--;//上面大
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        //ss = "asdasd asd";
        String[] s = ss.split(" ");

        System.out.println(s[0]+"  "+s[1]);
        System.out.println(lcs(s[0], s[1]));

    }
}


                    class Solution2 {
    public static String a(String s1, String s2) {
        if(s1==null||s2==null) return "-1";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int dp[][] = new int[c1.length+1][c2.length+1];
        StringBuilder sb = new StringBuilder();
        int maxlen = 0;
        for (int i = 1; i < c1.length+1; i++) {
            for (int j = 1; j < c2.length+1; j++) {
                if(c1[i-1]==c2[j-1]){
                    for (int k = 0; k < i; k++) {
                        if(dp[k][k]<j&&(dp[k+1][k+1]>j||dp[k+1][k+1]==0)){
                            dp[k+1] = dp[k].clone();
                            dp[k+1][k+1] = j;
                            if(maxlen<k+1) maxlen =k+1;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        Arrays.stream(dp[maxlen]).filter(i->i>0).forEach(i->sb.append(c2[i-1]));
        return sb.toString();
    }
}