package com.APractice.bigData;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
//        Student student = new Student("lihua", "11");
//        String sss = student.toString();
//        Student student1 = JSON.parseObject(sss, Student.class);
//        System.out.println(student1);

        String aa = "q,w,e,r,t,y";
        String[] split = aa.split(",");
        List<String> list = Arrays.asList(split);
        System.out.println(list);
        for (String s : split) {
            System.out.print(s+" ");
        }


    }
}
