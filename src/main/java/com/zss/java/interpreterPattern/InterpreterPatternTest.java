package com.zss.java.interpreterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式：客户端测试类
 */
public class InterpreterPatternTest {

  public static void main(String[] args) {
    InterpreterContext context = new InterpreterContext();
    List<AbstractExpresstion> list = new ArrayList<AbstractExpresstion>();
    list.add(new TerminalExpression());
    list.add(new NonTerminalExpression());
    list.add(new TerminalExpression());
    for (AbstractExpresstion exp : list) {
      exp.interpret(context);
    }
  }
}
