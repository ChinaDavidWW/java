package com.APractice.bigData;


import com.alibaba.fastjson.JSON;

import javax.xml.crypto.Data;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
//        Random random = new Random();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(random.nextInt(10));
//        }

        //System.out.println(UUID.randomUUID().toString() + "$1");

        String lihua = JSON.toJSONString(new Student("lihua", "12"));
        System.out.println(lihua);

        System.out.println(System.currentTimeMillis() + "===" + (new Date()).getTime());

    }
}
