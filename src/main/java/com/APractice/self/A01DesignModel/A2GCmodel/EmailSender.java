package com.APractice.self.A01DesignModel.A2GCmodel;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send a mail...");
    }
}
