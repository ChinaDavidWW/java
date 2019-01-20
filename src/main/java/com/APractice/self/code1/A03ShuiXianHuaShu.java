package com.APractice.self.code1;

/**
 * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class A03ShuiXianHuaShu {

    public static void main(String[] args) {
        int b, s, g;
        for (int i = 100; i <= 999; i++) {
            b = i / 100;
            s = (i / 10) % 10;
            g = i % 10;
            if (b * b * b + s * s * s + g * g * g == i) {
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
