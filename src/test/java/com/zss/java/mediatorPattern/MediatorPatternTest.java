package com.zss.java.mediatorPattern;

import com.zss.java.mediatorpattern.ConcreteColleagueA;
import com.zss.java.mediatorpattern.ConcreteColleagueB;
import com.zss.java.mediatorpattern.ConcreteMediator;

/**
 * 中介者模式：客户端测试类
 */
public class MediatorPatternTest {

  public static void main(String[] args) {
    ConcreteMediator mediator = new ConcreteMediator();
    // 使同事对象持有中介者对象
    ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
    ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

    // 使中介者持有并维护两个同事类
    mediator.setColleagueA(colleagueA);
    mediator.setColleagueB(colleagueB);

    colleagueA.send("吃过饭了吗？");
    colleagueB.send("没有呢");
  }
}
