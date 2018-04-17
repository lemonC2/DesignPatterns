package com.zss.java.statepattern;

/**
 * 具体状态类
 * @author lemon
 * @date 2018/4/17 15:40
 */
public class ConcreteStateB implements State{
    @Override
    public void handle(Context context) {
        //设置ConcreteStateB的下一状态
        context.setState(new ConcreteStateA());
       // context.request();
    }
}
