package com.APractice.self.A04Java8;

public class Demo1 {
    public static void main(String[] args) {
        runThreadByInnerClass();
        runThreadByLambda();
    }

    public static void runThreadByInnerClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类实现的线程");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void runThreadByLambda() {

       /* Runnable runnable = () -> System.out.println("这个是用拉姆达实现的线程");
        Runnable runnable1 = () -> System.out.println("确实是");
        new Thread(runnable).start();*/
    }
}
