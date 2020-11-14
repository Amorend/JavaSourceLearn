package com.company.test.bishi.t10_25;

public class A {


    public static void main(String[] args) {
        String str = "aads";
        StringBuffer result = new StringBuffer();
// 字符串长度
        int count = str.length();
// 取第一个字符
        char word1 = str.charAt(0);
// 连续字符的个数
        int sum = 1;
        for (int i = 1; i < count; i++) {
            // 循环取字符
            char word2 = str.charAt(i);
            // 把前一个字符和当前字符比较
            if (word1 == word2) {
                // 相同的字符 个数加1
                sum++;
                continue;
            }
            // 拼接字符
            result.append(word1).append(sum);
            // 当前字符变为前一个字符
            word1 = word2;
            // 个数清零
            sum = 1;
        }
// 加上最后一个字符及个数，并打印输出
        System.out.println("字符串压缩后:" + result.append(word1).append(sum));
    }

}

class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;

    public static void main(String[] args) {
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}