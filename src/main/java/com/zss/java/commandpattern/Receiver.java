package com.zss.java.commandpattern;

/**
 * 命令模式：接收者类——厨师
 */
public class Receiver {

  /**
   * 真正执行命令相应的操作
   */
  public void action() {
    System.out.println("执行请求操作！");
  }
}
