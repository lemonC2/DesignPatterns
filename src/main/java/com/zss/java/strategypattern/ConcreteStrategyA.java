package com.zss.java.strategypattern;

/**
 * 策略模式：具体算法A
 * @author lemon
 * @date 2018/4/16 11:04
 */
public class ConcreteStrategyA  implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现！");
    }
}
