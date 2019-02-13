package com.APractice.self.A04Java8.A4Date;

import java.time.Clock;

public class demo {
    public static void main(String[] args) {
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(clock.getZone());


    }
}
