package com.APractice.self.code1;

public class A06StringReverse {

    public static void main(String[] args) {
        String ss = "Hello world";
        stringReverse(ss);

    }

    public static void stringReverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse.toString());


    }
}
