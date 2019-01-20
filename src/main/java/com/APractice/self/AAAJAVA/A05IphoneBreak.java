package com.APractice.self.AAAJAVA;

import java.util.Scanner;

/**
 * 思路：
 * 用二分法(折半查找)，楼层总共120层，所以可以依次在以下楼层实验
 * {60,90,105,112,116,118,119}，所以最坏的情况是尝试7次。
 */


public class A05IphoneBreak {

    public static void main(String[] args) {
        int[] arr = {60, 90, 105, 112, 116, 118, 119};
        while (true) {
            System.out.print("请输入您觉得会摔碎的楼层数[0,120]之间：");

            Scanner input = new Scanner(System.in);
            find(arr, input.nextInt());

        }
    }

    private static void find(int[] ints, int i) {
        int start = 0;
        int end = ints.length - 1;
        while (true) {
            int mid = (start + end) / 2;
            if (i == ints[mid]) {
                System.out.println("index=" + mid + "恭喜你 猜对了");//刚好找到
                break;
            } else {
                if (i < ints[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //找不到
            if (start > end) {
                System.out.println("没有找到 不在此位置:" + start);//放在开始位置
                break;
            }

        }

    }

}
