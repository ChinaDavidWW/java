package com.APractice.self.AAAJAVA;

/**
 * 编程：最大方形
 给定一个元素是布尔型大小为N*M的矩阵A。大小为L的方形可以放置在A
 中的（X,Y）处，如果满足：
 0 < L <= min(N,M)
 0 <= X <= N-L
 0 <= Y <= M-L
 A[X+i][Y+j] = true, 0 <= i < L, 0 <= j < L
 如果L能被放置在（X,Y）以及（X+1,Y）或者（X,Y+1），我们说它可以被
 从（X,Y）移动到（X+1,Y）或者（X,Y+1）。
 我们想找出满足以下条件的最大的L：
 L可以被放置在（0,0）
 它可以被经过一系列的移动，从（0,0）到达（N-L,M-L）
 换句话说，我们想找到最大的方形，可以从左上移动到右下，移动方式
 是向下或者向右移动。一个极端情况是如果矩阵A中的元素全部是true，那
 么L = min(N,M)。
 写一个函数：int move_square(int **A, int N, int M);
 返回值为L。
 比如：
 A[0][0]=true A[0][1]=true A[0][2]=true A[0][3]=false
 A[1][0]=true A[1][1]=true A[1][2]=true A[1][3]=false
 A[2][0]=true A[2][1]=true A[2][2]=true A[2][3]=false
 A[3][0]=true A[3][1]=true A[3][2]=true A[3][3]=true
 A[4][0]=false A[4][1]=true A[4][2]=true A[4][3]=true
 A[5][0]=true A[5][1]=false A[5][2]=true A[5][3]=true
 返回 2
 A[0][0]=true A[0][1]=true A[0][2]=false A[0][3]=false
 A[1][0]=true A[1][1]=false A[1][2]=false A[1][3]=false
 A[2][0]=false A[2][1]=true A[2][2]=false A[2][3]=true
 返回 0
 A[0][0]=true
 返回 1
 假设：
 N和M是范围为[1,200]的整数
 */
//此题答案为借鉴网络，目前暂时对于动态规划问题甚是不熟
public class A03MaxSquare {
    public static void main(String[] args) {
        //for test
        char[][] arr2 = {
                {1, 1, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0}
        };
        SolutionDemo solutionDemo = new SolutionDemo();
        int result = solutionDemo.move_square(arr2, arr2.length, arr2[0].length);
        System.out.println(result);
    }


}


