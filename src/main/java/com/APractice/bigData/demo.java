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
        Date date = new Date(1548832611123L);
        DateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
        String format = dateFormat.format(date);
        System.out.println("日期为：   " + format);
        System.out.println("===================统计播放量===============================");
        String begin2018 = "2018-01-01 00:00:00";
        String end2018 = "2018-12-31 23:59:59";
        System.out.println("2018开始于： " + (sdf.parse(begin2018).getTime() +
                "    2018结束于： " + (sdf.parse(end2018)).getTime()));


    }
}
