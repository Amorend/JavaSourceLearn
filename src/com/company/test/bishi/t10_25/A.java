package com.company.test.bishi.t10_25;

public class A {


    public static void main(String[] args) {
        String str = "aads";
        StringBuffer result = new StringBuffer();
// �ַ�������
        int count = str.length();
// ȡ��һ���ַ�
        char word1 = str.charAt(0);
// �����ַ��ĸ���
        int sum = 1;
        for (int i = 1; i < count; i++) {
            // ѭ��ȡ�ַ�
            char word2 = str.charAt(i);
            // ��ǰһ���ַ��͵�ǰ�ַ��Ƚ�
            if (word1 == word2) {
                // ��ͬ���ַ� ������1
                sum++;
                continue;
            }
            // ƴ���ַ�
            result.append(word1).append(sum);
            // ��ǰ�ַ���Ϊǰһ���ַ�
            word1 = word2;
            // ��������
            sum = 1;
        }
// �������һ���ַ�������������ӡ���
        System.out.println("�ַ���ѹ����:" + result.append(word1).append(sum));
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