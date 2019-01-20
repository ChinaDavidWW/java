package com.APractice.self.A01DesignModel.A4ProxyModel.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {
    private Object ImpClass;

    public LogHandler(Object realObject) {
        this.ImpClass = realObject;
    }

    public Object bind(Object impClass) {
        this.ImpClass = impClass;
        return Proxy.newProxyInstance(impClass.getClass().getClassLoader(), impClass.getClass().getInterfaces(), this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在调用代理的对象的真实方法前 我先调用一些自己的方法和规则..... 下面调用真实方法");

        System.out.println("Method:   " + method);

        method.invoke(ImpClass, args);

        System.out.println("调用代理的对象的真实方法后， 我进行一些逻辑处理 上面是调用的真实方法");

        return null;

    }

    public static void main(String[] args) {

    }
}
