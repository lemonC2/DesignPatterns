package com.zss.java.visitorPattern;

/**
 * 访问者模式：具体元素类A
 */
public class ConcreteElementA extends Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementA(this);
  }

  /**
   * ConcreteElementA 特有方法
   */
  public void operationA() {

  }
}
