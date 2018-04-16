package com.zss.java.strategypattern;

/**
 * @author lemon
 * @date 2018/4/16 11:12
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        Context context ;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();


    }
}
