package com.zss.java.mediatorpattern;

/**
 * 中介者实现类——存在多个中介者时，该类就是众多中介者类实现中的一个；但是若中介者仅有一个，则可将中介者实现类与中介者抽象类合并成为一个
 * @author lemon
 * @date 2018/4/19 16:40
 */
public class ConcreteMediator  extends  Mediator{
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    protected void send(String message, Colleague colleague) {
        if (colleague == colleagueA){
            colleagueB.getMessage(message);
        }else {
            colleagueA.getMessage(message);
        }
    }
}
