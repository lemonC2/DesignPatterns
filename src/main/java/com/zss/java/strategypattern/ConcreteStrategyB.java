package com.zss.java.strategypattern;

/**
 * 策略模式：具体算法B
 * @author lemon
 * @date 2018/4/16 11:04
 */
public class ConcreteStrategyB  implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
}
