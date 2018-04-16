package com.zss.java.strategypattern;

/**
 * 环境角色类
 *实现策略算法的实现与客户端解耦即客户端的算法（方法）使用都是通过context实现，与后台的具体算法实现无关或后台的算法实现对客户端是透明的
 * 该类同时也承担了条件判断的选择即若有不同条件的方法选择，会通过该类实现；解决：Java反射。
 * @author lemon
 * @date 2018/4/16 11:06
 */
public class Context {

    //申明一个抽象的策略对象
    private Strategy strategy;

    //构造函数，传入一个具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //策略方法
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
