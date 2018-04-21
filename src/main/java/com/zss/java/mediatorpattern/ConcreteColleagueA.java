package com.zss.java.mediatorpattern;

/**
 * 具体对象A——同事A
 * @author lemon
 * @date 2018/4/19 16:40
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    //发送消息
    public void send(String message){
        mediator.send(message,this);
    }

    //获取消息
    public void getMessage(String message){
        System.out.println("同事A得到消息：" + message);
    }
}
