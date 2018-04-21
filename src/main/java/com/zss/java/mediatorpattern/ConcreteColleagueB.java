package com.zss.java.mediatorpattern;

/**
 * 具体类B
 * @author lemon
 * @date 2018/4/19 16:40
 */
public class ConcreteColleagueB  extends Colleague{
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    /**
     * 发送消息
     *
     * @param messge
     */
    public void send(String messge) {
        mediator.send(messge,this);
    }

    /**
     * 获取消息
     *
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("同事B得到消息：" + message);
    }
}
