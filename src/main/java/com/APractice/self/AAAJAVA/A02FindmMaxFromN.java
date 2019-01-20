package com.APractice.self.AAAJAVA;

import java.util.Arrays;

/**
 * 编程实现从N个无序数中选取M个最大的数（0 < M < N )
 */
public class A02FindmMaxFromN {

    public static void main(String[] args) {
        //for test
        int arrayDemo[] = {0, 99, 3, 5, 5, 66, 77, 12, 34, 100, 999, 888};
        find(arrayDemo, 4);

    }

    //功能函数,从数组中找出最大的M个数
    private static void find(int A[], int M) {
        //先给排序后的数组
        String arraysAfterSort = Arrays.toString(sort(A));
        System.out.println("排序后的数组为：" + arraysAfterSort);
        int[] newData;
        newData = Arrays.copyOfRange(A, A.length - M, A.length);

        System.out.println("取出的最大的"+M+"个数为：" + Arrays.toString(newData));
    }

    //辅助函数，用于给数组排序,此处选择直接排序法
    private static int[] sort(int A[]) {
        for (int i = 0; i < A.length; i++) {
            int temp = i;
            for (int j = i; j < A.length; j++) {
                if (A[j] < A[temp]) {
                    temp = j;
                }
            }
            int temp1 = A[i];
            A[i] = A[temp];
            A[temp] = temp1;

        }
        //System.out.println(Arrays.toString(A));
        return A;
    }


}
