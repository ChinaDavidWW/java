package com.APractice.self.code1;

/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 */
public class A02suShuCount {
    public static void main(String[] args) {
        int count = 0, i, j;
        for (i = 101; i <= 200; i++) {
            boolean flag = false;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag == true) {
                count++;
                System.out.println(i + "是素数");
            }
        }
        System.out.println("总共有" + count + "个素数");
    }

}
