package com.company.test.xiti;

/**
 * 10进制转换16进制以内的任意进制
 */
public class Test02 {
    static String ss = "";
    static int jinzhi;
    public static void main(String[] args) {
        int a = 234534656;
        qw(a,16);
        System.out.println(ss);
        //String reverse = new StringBuffer(ss).reverse().toString();  //反转字符串
        //System.out.println(reverse);
        System.out.println(Integer.toHexString(a)+"真16");
        //System.out.println(Integer.toOctalString(a)+"真8");
        //System.out.println(Integer.toBinaryString(a)+"真2");
    }

    static void qw(int a,int b){
        jinzhi = b;
        qwe(a);
    }

    static void qwe(int a){
        if (a>jinzhi-1){
            qwe((a-(a%jinzhi))/jinzhi);
        }
        switch (a%jinzhi){
            case 0:
                ss+="0";
                break;
            case 1:
                ss+="1";
                break;
            case 2:
                ss+="2";
                break;
            case 3:
                ss+="3";
                break;
            case 4:
                ss+="4";
                break;
            case 5:
                ss+="5";
                break;
            case 6:
                ss+="6";
                break;
            case 7:
                ss+="7";
                break;
            case 8:
                ss+="8";
                break;
            case 9:
                ss+="9";
                break;
            case 10:
                ss+="a";
                break;
            case 11:
                ss+="b";
                break;
            case 12:
                ss+="c";
                break;
            case 13:
                ss+="d";
                break;
            case 14:
                ss+="e";
                break;
            case 15:
                ss+="f";
                break;
        }

    }
}
