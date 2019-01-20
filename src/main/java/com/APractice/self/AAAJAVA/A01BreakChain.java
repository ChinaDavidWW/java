package com.APractice.self.AAAJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个包含N个整数的数组A，假设这个数组表示的是一条链条，其中
 * 每个元素表示链条上的一环。现在我们想把这条链条断成3小部分。我们需
 * 要做的就是断开不相连的两个环，更确切的说，我们需要断开环P、Q
 * （0<P<Q<N-1, Q-P > 1），得到三个小链条[0,P-1],[P+1,Q-1],[Q+1,N-1]。
 * 上述操作的成本是A[P]+A[Q]。
 * 例如：数组A为
 * A[0] = 5
 * A[1] = 2
 * A[2] = 4
 * A[3] = 6
 * A[4] = 3
 * A[5] = 7
 * 我们可以选择如下方式断开链条
 * - （1，3）：成本是 2+6 = 8
 * - （1，4）：成本是 2+3 = 5
 * - （2，4）：成本是 4+3 = 7
 * 写一个函数
 * int breakchain(int A[], int N);
 * 对任一个给定的链条，返回断开链条的最低成本，比如上面的例子中，
 * 需要返回最低成本5
 * 假设：
 * - N是整数，范围[5,100000]
 * A的元素是范围在[1,1000000000]的整数
 */
public class A01BreakChain {
    public static void main(String[] args) {
        //for test (也可以随机生成数组或者手动修改下面数组进行验证)
        int arrayDemo[] = {1, 6, 4, 6, 0, 192, 100, 11, 12, 33, 44, 56, 78, 99};
        breakchina(arrayDemo);
    }

    //功能函数
    private static void breakchina(int A[]) {
        int N = A.length;//数组的总长度
        List<Integer> list = new ArrayList<>();
        for (int p = 1; p < N - 1; p++) {
            for (int Q = 3; Q < N - 1; Q++) {
                if (p < Q && Q - p > 0 && Q - p > 1) {//执行条件
                    list.add(sum(A[p], A[Q]));
                }
            }
        }
        System.out.println("总取法成本值如下：" + list);
        System.out.println("最小成本是：" + Collections.min(list) + "  " + "最大成本是" + Collections.max(list));
    }

    //辅助函数，用于求出2个切入点在数组对应的值
    private static int sum(int a, int b) {
        return a + b;
    }

}
