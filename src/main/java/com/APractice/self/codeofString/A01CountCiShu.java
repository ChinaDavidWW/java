package com.APractice.self.codeofString;

import java.util.*;


//1  统计某个字符在目标字符串中出现的次数
//2 实现字符串逆序   字符串的旋转
public class A01CountCiShu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请随机输入一个字符串：");
        String next = scanner.next();
        System.out.println("请随机输入一个字符：");
        String next1 = scanner.next();
        count1(next, next1.charAt(0));
        reverse(next);
        removeExist(next);
        countExistNumber(next);
        String[] s1 = {"qwe", "wer", "123"};
        String[] s2 = {"qwe", "234", "444"};
        intersection(s1, s2);
        A01CountCiShu a01CountCiShu = new A01CountCiShu();
        int i = a01CountCiShu.hashCode();
        System.out.println("i"+"==="+i);


    }

    public static void count1(String goalString, char c) {
        char[] chars = goalString.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }

        }
        System.out.println("出现的次数为：" + count);

    }

    public static void reverse(String string) {
        //实现字符串的逆序
        char[] chars = string.toCharArray();
        List<Character> linkedList = new LinkedList<>();
        for (int i = chars.length; i > 0; i--) {
            linkedList.add(chars[i - 1]);
        }
        System.out.println("逆序后的字符串为：" + linkedList.toString());
    }

    //去除字符串中的重复字符
    public static void removeExist(String string) {
        char[] chars = string.toCharArray();
        Set<Character> treeSet = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            treeSet.add(chars[i]);
        }
        System.out.println("去重后的字符串为：" + treeSet.toString());
    }

    //java统计字符串中每个字符出现的次数
    public static void countExistNumber(String string) {
        char[] chars = string.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char c : chars) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }

        }
        for (char key : hashMap.keySet()) {
            System.out.println(key + " " + "出现" + " " + hashMap.get(key) + "次" + ";   ");
        }
    }
    //写一个方法查找出两个字符串的交集

    public static void intersection(String[] string1, String[] string2) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (String s1 : string1) {
            if (!hashMap.containsKey(s1.toLowerCase())) {
                hashMap.put(s1.toLowerCase(), Boolean.TRUE);
            }
        }
        for (String s2 : string2) {
            if (hashMap.containsKey(s2.toLowerCase())) {
                hashMap.put(s2, Boolean.FALSE);
            }
        }

        for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(Boolean.FALSE)) {
                linkedList.add(entry.getKey());
            }
        }
        System.out.println("交集是：" + linkedList.toString());


    }




}
