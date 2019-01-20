package com.APractice.self.dyc;

import java.util.HashSet;
import java.util.Set;

public class MainOb {
    public static void main(String[] args) {
        Subbb subbb = new Subbb();
        Set<String> strings = new HashSet<>();
        strings.add("1212");
        strings.add("1212");
        subbb.setIds(strings);
        System.out.println(subbb.toString());




    }
}
