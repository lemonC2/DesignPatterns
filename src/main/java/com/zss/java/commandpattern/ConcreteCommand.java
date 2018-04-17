package com.zss.java.commandpattern;

/**
 * 具体命令类：即实现命令接口的类
 * @author lemon
 * @date 2018/4/17 20:13
 */
public class ConcreteCommand implements Command {

    //持有相应的接收者对象——即服务员
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者真正执行请求
        receiver.action();
    }
}
