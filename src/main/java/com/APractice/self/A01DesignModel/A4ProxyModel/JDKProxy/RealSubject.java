package com.APractice.self.A01DesignModel.A4ProxyModel.JDKProxy;

public class RealSubject implements SubjectOperations {

    @Override
    public void print() {
        System.out.println("我实现了接口 完成这个打印操作！！");
    }

    @Override
    public void printfStr(String string) {
        System.out.println("打印输入的内容：" + string);

    }
}
