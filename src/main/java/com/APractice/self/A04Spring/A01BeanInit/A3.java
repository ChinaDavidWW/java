package com.APractice.self.A04Spring.A01BeanInit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A3 implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("大家好  开个会");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("会开完了   ====");
    }

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init1() {
        System.out.println("Bean is going through init.");
    }

    public void destroy2() {
        System.out.println("Bean will destroy now.");
    }
}
