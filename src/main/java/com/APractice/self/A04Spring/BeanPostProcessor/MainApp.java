package com.APractice.self.A04Spring.BeanPostProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testSpring.xml");
        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");
        bean.getMessage();
        context.registerShutdownHook();

    }
}
