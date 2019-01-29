package com.APractice.bigData;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws Exception {

        //2019-1-18 20:19:11
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String time = "2019-1-18 18:00:00";
        Date d = sdf.parse(time);
        System.out.println("事故开始时间   ：" + d.getTime());



        String time2 = "2019-1-21 20:30:00";
        Date parse = sdf.parse(time2);
        System.out.println("事故结束时间   ：" + parse.getTime());
        System.out.println("----------------------------------");
        Date date = new Date(1546686723713L);
        DateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);


    }
}
