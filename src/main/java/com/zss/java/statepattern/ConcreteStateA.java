package com.zss.java.statepattern;

/**
 * 具体状态类
 * @author lemon
 * @date 2018/4/17 15:40
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        //设置ConcreteStateA 的下一状态ConcreteStateB
        context.setState(new ConcreteStateB());
        //context.request();
    }
}
