package com.APractice.self.A04Spring.A01BeanInit;

public class A2 {
    public A2() {
        super();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A2(String name) {
        this.name = name;
    }

    public void method() {
        String name = "huahua";
        A2 a2 = new A2();
        a2.setName(name);
        System.out.println("实例化A2 用静态工厂" + a2.getName().toString());

    }
}
