package com.APractice.self.A01DesignModel.A4ProxyModel;

public class People implements BuyCar {
    private int cash;
    private String vip;
    private String username;

    @Override
    public void buycar() {
        System.out.println(username + "is vip so he/she can" +
                "buy any car...");
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


