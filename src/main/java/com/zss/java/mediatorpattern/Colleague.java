package com.zss.java.mediatorpattern;

/**
 * 抽象接口——例如：同事类的抽象功能接口
 *
 * @author lemon
 * @date 2018/4/19 16:40
 */
public abstract class Colleague {

    //持有一个中介者对象
    protected Mediator mediator;

    //初始化中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
