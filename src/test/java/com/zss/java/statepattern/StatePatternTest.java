package com.zss.java.statepattern;

/**
 * 测试类
 * @author lemon
 * @date 2018/4/17 15:47
 */
public class StatePatternTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
    }
}
