package com.APractice.self.dyc;

import java.util.Random;


public class demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            System.out.print((new Random()).nextInt(6)+ "  ");
        }
    }
}
