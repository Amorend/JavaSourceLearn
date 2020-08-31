package com.company.test.bishi.t58;

public class a58 {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(0));// 转二进制
        System.out.println(Integer.toOctalString(527));// 转八进制
        System.out.println(Integer.toHexString(0));// 转十六进制
    }
    public static void main3(String[] args) {
        System.out.println(main2());
    }
    public static int main2() {
        try{
            throw new Exception();

        } catch (Exception e) {
            return 1;
        }finally {
            return 2;
        }
    }
    public static void main1(String[] args) {
        int i = 0;
        while (i<10){
            switch (i){
                case 0:;
                case 1:i+=2;
                case 2:i+=4;
                default:i+=5;
            }
        }
        System.out.println(i);
    }
    static void c(Object c){

    }
    static void c(String c){
        System.out.println("a");
    }
}
