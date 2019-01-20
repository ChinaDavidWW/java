package com.APractice.self.A01DesignModel.A3CXGCModel;


import com.APractice.self.A01DesignModel.A2GCmodel.SMSSender;
import com.APractice.self.A01DesignModel.A2GCmodel.Sender;

// 专门生产SMS的工厂
public class SMSFactory implements Producer {
    @Override
    public Sender provider() {
        return new SMSSender();
    }
}
