package com.APractice.self.A01DesignModel.A2GCmodel;

//工厂模式
public class Factory {
    //创建相应的产品  根据产品类型
    public Sender producesender(String senderType) {
        if (senderType == null) {
            return null;
        } else if (senderType.equals("sms")) {
            return new SMSSender();
        } else if (senderType.equals("email")) {
            return new EmailSender();
        } else {
            System.out.println("invalid senderType...");
            return null;
        }

    }


}
