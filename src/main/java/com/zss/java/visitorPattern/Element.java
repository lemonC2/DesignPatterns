package com.zss.java.visitorPattern;

/**
 * 访问者模式：抽象元素类
 */
public abstract class Element {

  /**
   * 接收操作
   *
   * @param visitor 访问者类
   */
  public abstract void accept(Visitor visitor);
}
