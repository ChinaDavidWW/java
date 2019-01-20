package com.APractice.self.A01DesignModel.A3CXGCModel;


import com.APractice.self.A01DesignModel.A2GCmodel.EmailSender;
import com.APractice.self.A01DesignModel.A2GCmodel.Sender;

// 专门生成email的工厂
public class EmailFactory implements Producer {
    @Override
    public Sender provider() {

        return new EmailSender();
    }
}
