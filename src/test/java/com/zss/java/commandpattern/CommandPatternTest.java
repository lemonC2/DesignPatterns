package com.zss.java.commandpattern;

/**
 * 命令模式：客户端测试类
 */
public class CommandPatternTest {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker(command);
    invoker.action();
  }
}
