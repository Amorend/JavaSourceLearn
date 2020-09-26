package com.company.test.bishi.t9_26;

public class B {
    static int g(String s1,String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i < s1.length(); i++) {
            char c1 = s1.charAt(i-1);
            for (int j = 1; j < s2.length(); j++) {
                char c2 = s2.charAt(j-1);
                if(c1 == c2){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i][j]-1,dp[i-1][j]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        System.out.println(g("1A2C3D4B56", "B1D23CA45B6A"));
    }
}
