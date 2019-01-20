package com.APractice.self.code1;

import java.util.ArrayList;

/**
 * 找出数组中重复的元素
 */
public class A05shuZuCfu {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 9};
        findCfu(arr);

    }

    public static void findCfu(int[] arrs) {
        ArrayList<Integer> cfuList = new ArrayList<>();
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] == arrs[j]) {
                    cfuList.add(arrs[i]);
                }
            }
        }
        System.out.println(cfuList);
    }
}


