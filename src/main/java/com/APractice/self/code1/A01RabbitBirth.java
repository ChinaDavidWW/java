package com.APractice.self.code1;

import java.util.Scanner;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * //这是一个菲波拉契数列问题
 */
public class A01RabbitBirth {
    /**
     * 1  2  3  4  5  6  7   8 (月份)
     * 1  1  2  3  5  8  13  21
     * 语法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthInput;
        while (true) {
            System.out.println("请输入月份,并且以回车键结束:");
            monthInput = scanner.nextInt();

            if (monthInput == 1 || monthInput == 2) {
                System.out.println("兔子的数量为：" + 1 + "对");
            }
            if (monthInput >= 3) {
                System.out.println("兔子的数量为：" + count(monthInput) + "对");
            }
        }

    }

    public static int count(int month) {
        int count1 = 1, count2 = 1, count = 0;
        for (int i = 3; i <= month; i++) {
            count = count1 + count2;
            count1 = count2;
            count2 = count;
        }
        return count;
    }

}
