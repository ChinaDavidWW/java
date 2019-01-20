package com.APractice.self.A01DesignModel.A4ProxyModel.JDKProxy;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        LogHandler logHandler = new LogHandler(realSubject);
        //转化成接口 只能代理实现了接口的类
        SubjectOperations subjectOperations = (SubjectOperations) logHandler.bind(realSubject);
        System.out.println(subjectOperations.getClass().getName());

        subjectOperations.print();
        subjectOperations.printfStr("YYYYYY");

    }
}
