package com.APractice.self.A01DesignModel.A4ProxyModel;

/**
 * 使用场景
 * <p>
 * 1、Windows 里面的快捷方式。
 * 2、猪八戒去找高翠兰结果是孙悟空变的，可以这样理解：
 * 把高翠兰的外貌抽象出来，高翠兰本人和孙悟空都实现了这个接口，
 * 猪八戒访问高翠兰的时候看不出来这个是孙悟空，所以说孙悟空是高翠兰代理类。
 * 3、买火车票不一定在火车站买，也可以去代售点。
 * 4、一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，
 * 并提供对签发人账号上资金的控制。
 * 5、spring aop。
 * <p>
 */

//代理类 去检测买车行为是否符合规定
public class ProxyBuyCar implements BuyCar {
    private People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public void buycar() {
        if (people.getVip().equals("vip")) {
            people.buycar();
        } else if (people.getCash() >= 500) {
            System.out.println(people.getUsername() + "" +
                    "buy a new car trade over...");
        } else {
            System.out.println(people.getUsername() + "" +
                    "people can't buy a car");
        }


    }
}
