package com.APractice.self.code1;

public class A07SortedMethod {

    public static void main(String[] args) {
        int[] arrs = {2, 4, 11, 6, 1, 12, 42, 0, -1};
        bubbleMethod(arrs);//冒泡
        selectSort(arrs);//选择


    }


    //冒泡排序法
    public static void bubbleMethod(int[] arrs) {
        int temp;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] < arrs[j]) {
                    temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        System.out.print("排序后为：" + "  ");
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println(" ");
    }

    //选择排序法
    public static void selectSort(int[] arrs) {
        int temp;
        for (int i = 0; i < arrs.length; i++) {
            int k = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] < arrs[j]) {
                    k = j;
                }
            }
            temp = arrs[i];
            arrs[i] = arrs[k];
            arrs[k] = temp;
        }
        System.out.print("排序后为：" + "  ");
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
    }

}
