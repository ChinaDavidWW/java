package com.APractice.self.code2;

/**
 *
 *
 */

public class Test {
    public static void main(String[] args) {


        String a = "123";
        String b = new String("123");
        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println();
        char[] chars = a.toCharArray();
        System.out.println(a);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

    }
}
