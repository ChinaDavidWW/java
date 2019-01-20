package com.APractice.self.A04Java8;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("aa", 12));
        users.add(new User("bb", 13));
        users.add(new User("cc", 14));
        //users.forEach((User user) -> System.out.println(user.getName()));

    }
}
