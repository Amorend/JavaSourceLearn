package com.company.test.bishi.t9_8mi;


import java.util.Scanner;

public class B {
    static String num = ".*\\d+.*";
    static String upper = ".*[A-Z]+.*";
    static String lower = ".*[a-z]+.*";
    static String symbol = ".*[~!@#$%^&*()_+|<>,.?/;:'бо\\[\\]{}\"]+.*";

    static String changdu(String password){
        if (password == null || password.length() <8 || password.length()>120){
            return "1";
        }
        int i = 0;
        if (password.matches(num))i++;
        if (password.matches(lower))i++;
        if (password.matches(upper))i++;
        if (password.matches(symbol))i++;
        if (i<=3)return "2";
        return "0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String s = sc.next();
        System.out.println(s);
        String[] pwds = s.split("\\s");
        for (int i = 0; i < pwds.length; i++) {
            String check = changdu(pwds[i]);
            System.out.println(check);
        }
    }
}
