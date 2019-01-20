package com.APractice.self.A01DesignModel.A3CXGCModel;


import com.APractice.self.A01DesignModel.A2GCmodel.Sender;

//抽象工厂  具有生产具体工厂的功能
public interface Producer {
    public Sender provider();
}


