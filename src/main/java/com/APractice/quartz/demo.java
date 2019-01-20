package com.APractice.quartz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class demo {

    public static void main(String[] args) {
        //listIterator()

        /*List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        Integer integer = list.get(list.size() - 1);
        System.out.println(integer);*/
        System.out.println((new Date()).getTime());
        String abc123 = String.format("abc123", new Date());
        System.out.println(abc123);


    }
}
