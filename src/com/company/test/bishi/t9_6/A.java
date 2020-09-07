package com.company.test.bishi.t9_6;

public class A {
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.isEctopic("car", "car"));
        System.out.println(a.addIt("Œ¢√ÀŒ¢…˙Ã¨"));
    }

    public String addIt (String str) {
        // write code here
        int length = str.length();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < length/2; i++) {
            stringBuffer.append(str.charAt(i));
        }
        stringBuffer.append("+");
        for (int i = length/2; i < length; i++) {
            stringBuffer.append(str.charAt(i));
        }

        return stringBuffer.toString();
    }



    public boolean isEctopic (String first, String second) {
        int[] fir = new int[26];
        int[] sec = new int[26];
        for (char ch : first.toCharArray()){
            fir[ch - 'a']++;
        }
        for (char ch : second.toCharArray()){
            sec[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (fir[i] != sec[i]){
                return false;
            }

        }
        return true;
    }

}
