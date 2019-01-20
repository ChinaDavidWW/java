package com.APractice.self.A01DesignModel.A2GCmodel;

public class SenderFactory {
    public static Sender produceEmail() {
        return new EmailSender();
    }

    public static Sender produceSMS() {
        return new SMSSender();
    }

}
