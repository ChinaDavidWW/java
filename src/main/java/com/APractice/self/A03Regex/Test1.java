package com.APractice.self.A03Regex;

public class Test1 {
    public static void main(String[] args) {

        //替换
        String name = "nihao141311164sdfsdf1232";
        String reg = "1[23456]\\d{3}";
        String aa = name.replaceAll(reg, "****_"); //将满足条件的内容替换成****格式
        System.out.println(aa);

        //匹配功能
        String match = "1[12a]\\d{2}";
        String mat = "a[12a]\\d{2,}";
        String match3 = "a\\d{0,2}[a]{2}";
        /**
         * 第一个为a 第二个开始后0个到2个内必须为数字 剩下的两位必须为a
         * 数量词如{2} 必须跟范围词或者预定义符后面有效 是对这两个的修饰
         */
        System.out.println("1223".matches(match) ? "ok" : "flase");//number是被匹配的字符串
        System.out.println("a2313131".matches(mat) ? "OK" : "FALSE");
        //意思就是第一个为1 第二个为1或2或a 接下来的为数字并且有且只有两个
        System.out.println("a01aa".matches(match3) ? "true" : "False");

        //根据重叠词进行切割
        String str = "sdqqfgkkkhjppppkl";
        String regex = "(.)\\1+";
        String[] arr = str.split("(.)\\1+");
        String[] split = str.split(regex);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();


        String str2 = "aa.bb.cc";
        String str3 = "-1     99    4    23";
        String[] arr12 = str2.split(" +");    //+这里代表一个或者多个空格

        //邮箱
        String strm1 = "123sdf1212sd@sin1231.com.cn";

        String strm2 = "1@1.1";
        String regm2 = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]+(\\.[a-zA-Z]+)+";
        System.out.println(strm1.matches(regm2));
        System.out.println(strm2.matches(regm2));

        //emil  https://blog.csdn.net/qq_38409944/article/details/80086278



    }
}
