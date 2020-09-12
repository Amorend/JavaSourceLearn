package com.company.test.bishi.t9_8mi;


import java.util.Scanner;

public class B {

    final static String num = ".*\\d+.*";
    final static String num1 = null;
    static String upper = ".*[A-Z]+.*";
    static String lower = ".*[a-z]+.*";
    static String symbol = ".*[~!@#$%^&*()_+|<>,.?/;:'бо\\[\\]{}\"]+.*";

    static String changdu(String password) {
        if (password == null || password.length() < 8 || password.length() > 120) {
            return "Irregular password";
          //  return "1";
        }
        int i = 0;
        if (password.matches(num)) i++;
        if (password.matches(lower)) i++;
        if (password.matches(upper)) i++;
        if (password.matches(symbol)) i++;
        if (i <= 3) return "Irregular password";
        return "Ok";
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String s = sc.next();
//        System.out.println(s);
        String[] pwds = s.split("\\s");
        for (int i = 0; i < pwds.length; i++) {
            String check = changdu(pwds[i]);
            System.out.println(check);
        }

    }
    static String s = "";
    static String[] pwds = s.split("\\s");
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        T h = new T();
        h.start();

        while (true){
            String t = sc.next();
            sc.useDelimiter("\n");
            if (t.equals("")||t == null){
                break;
            }

            s += t;
            s += " ";

                h.sleep(3000);

        }

//        System.out.println(s);


    }

    static void forf(){
        for (int i = 0; i < pwds.length; i++) {
            String check = changdu(pwds[i]);
            System.out.println(check);
        }
    }
}
class T extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        B.forf();
    }
}