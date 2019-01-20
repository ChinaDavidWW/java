package com.APractice.self.AAAJAVA;

/**
 * 编程：顺时针环绕列印矩阵元素
 * 给定一个整数元素组成的矩阵，写一个函数，返回一个数组，数组中的元
 * 素是按照顺时针遍历矩阵中的元素而组成。例如如下的3x4矩阵：
 * 2, 3, 4, 8
 * 5, 7, 9, 12
 * 1, 0, 6, 10
 * 得到的数组的元素按照顺序是“2, 3, 4, 8, 12, 10, 6, 0, 1, 5, 7, 9”.
 */
public class A04PrintArray {
    public static void main(String[] args) {
        //for test
        int[][] arr2 = {
                {1, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12},
                {13, 14, 15, 16}
        };
        printArray(arr2);

    }

    //功能函数  顺时针打印(具体函数)
    private static void printArray(int[][] arr, int row, int column, int n) {
        if (n == 0)
            return;
        if (n == 1) {
            print(arr[row][column]);
            return;
        }
        ptintElementClockWise(arr, row, column);
        printArray(arr, row + 1, column - 1, n - 2);
    }

    //辅助函数，顺时针打印具体函数
    private static void ptintElementClockWise(int[][] arr, int row, int column) {
        for (int i = row; i <= column; i++)
            print(arr[row][i]);
        for (int i = row + 1; i <= column; i++)
            print(arr[i][column]);
        for (int i = column - 1; i >= row; i--)
            print(arr[column][i]);
        for (int i = column - 1; i > row; i--)
            print(arr[i][row]);
    }

    //打印主函数
    public static void printArray(int[][] arr) {
        if (arr == null || arr.length == 0)
            return;

        printArray(arr, 0, arr.length - 1, arr.length);

    }


    //辅助函数 打印函数
    private static void print(int i) {
        System.out.println(i + " ");
    }


}
