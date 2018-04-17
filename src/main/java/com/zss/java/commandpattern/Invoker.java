package com.zss.java.commandpattern;

/**
 * 命令模式：请求者类——客户（服务员）
 */
public class Invoker {

  /**
   * 命令对象
   */
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  /**
   * 行动方法
   */
  public void action() {
    command.execute();
  }
}
