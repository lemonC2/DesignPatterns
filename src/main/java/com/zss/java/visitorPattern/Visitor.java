package com.zss.java.visitorPattern;

/**
 * 访问者模式：访问者类
 */
public abstract class Visitor {

  /**
   * 对应于 ConcreteElementA 的访问操作
   *
   * @param concreteElementA 具体元素 A
   */
  public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

  /**
   * 对应于 ConcreteElementB 的访问操作
   *
   * @param concreteElementB 具体元素 B
   */
  public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
