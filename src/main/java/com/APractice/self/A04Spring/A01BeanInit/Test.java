package com.APractice.self.A04Spring.A01BeanInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        //1.构造器实例化；
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("testSpring.xml");
        A1 a1 = (A1) applicationContext.getBean("A1");
        a1.method();
        System.out.println();
        //2.静态工厂方法
        A2 a2 = (A2) applicationContext.getBean("A2");
        a2.method();
        System.out.println();
        //3.实例化工厂方法
       /* A3 a3 = (A3) applicationContext.getBean("A3");
        a3.getMessage();
        a3.setMessage("你好啊啊啊啊啊");

        A3 a31 = (A3) applicationContext.getBean("A3");
        a31.getMessage();*/
        A3 a3 = (A3) applicationContext.getBean("A3");
        a3.getMessage();
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        Properties properties = new Properties();
        properties.setProperty("1", "2");


    }
}
