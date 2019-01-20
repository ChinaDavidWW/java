package com.APractice.self.A04Spring.A01BeanInit;

public class A2StaticFactory {
    //创建静态方法
    public static A2 createA2Bean() {
        //返回实例化的类的对象
        return new A2();
    }
}
