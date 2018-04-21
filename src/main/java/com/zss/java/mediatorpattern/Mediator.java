package com.zss.java.mediatorpattern;

/**
 * 中介者抽象类——用于存在多个中介者存在时对多个中介者功能的抽象
 * @author lemon
 * @date 2018/4/19 16:41
 */
public abstract  class Mediator {

    /**
     * 多个对象在自身发生改变时通知中介者方法
     * 让中介者实现多个对象之间的交互
     * @param message
     * @param colleague
     */
    protected abstract void send(String message,Colleague colleague);
}
