package com.APractice.self.AAAJAVA;

import java.util.Stack;

/**
 * 转化为直方图，以每一行产生一个直方图，从被选中行累加“1”的数目，直到遇到0。
 */
public class SolutionDemo {


    private Stack<Integer> stack = new Stack<>();


    //辅助函数：求直方图的最大面积
    private int histogram(int[] nums) {
        stack.clear();
        int max = 0;
        for (int j = 0; j < nums.length; j++) {
            if (stack.isEmpty() || nums[stack.peek()] <= nums[j]) {
                stack.push(j);
                continue;
            }
            do {
                int p = stack.pop();
                int s = stack.isEmpty() ? nums[p] * j : nums[p] * (j - stack.peek() - 1);
                max = Math.max(max, s);
            } while (!stack.isEmpty() && nums[stack.peek()] > nums[j]);
            stack.push(j);
        }
        while (!stack.isEmpty()) {
            int p = stack.pop();
            int s = stack.isEmpty() ? nums[p] * nums.length : nums[p] * (nums.length - stack.peek() - 1);
            max = Math.max(max, s);
        }
        return max;
    }

    //功能函数：求整个矩阵中直方图的最大面积
    public int move_square(char[][] matrix, int N, int M) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int max = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] counts = new int[n][m];
        for (int j = 0; j < m; j++) counts[0][j] = matrix[0][j] == '1' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                counts[i][j] = matrix[i][j] == '1' ? counts[i - 1][j] + 1 : 0;
            }

        }
        for (int i = 0; i < n; i++) {
            int s = histogram(counts[i]);
            max = Math.max(max, s);
        }
        return max;
    }
}
