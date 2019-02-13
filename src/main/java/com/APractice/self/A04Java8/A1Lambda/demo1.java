package com.APractice.self.A04Java8.A1Lambda;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c", "d", "e").forEach(e -> System.out.println(e));
        Arrays.asList("1", "2", "3").forEach((String e) -> System.out.println(e));
        String separator = ",";
        Arrays.asList("q", "w", "t").forEach((e -> System.out.println(e + separator)));
        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));
        Arrays.asList("w", "e", "r").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });




    }

}
