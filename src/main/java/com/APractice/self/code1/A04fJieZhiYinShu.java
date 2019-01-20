package com.APractice.self.code1;

import java.util.Scanner;

/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */
public class A04fJieZhiYinShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数：");
            int n = scanner.nextInt();
            int k = 2;
            System.out.print(n + "=");
            while (k <= n) {
                if (k == n) {
                    System.out.println(n);
                    break;
                } else if (n % k == 0) {
                    System.out.print(k + "*");
                    n = n / k;
                } else k++;
            }
        }
    }
}
