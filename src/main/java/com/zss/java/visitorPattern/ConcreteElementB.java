package com.zss.java.visitorPattern;

/**
 * 访问者模式：具体元素类B
 */
public class ConcreteElementB extends Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementB(this);
  }

  /**
   * ConcreteElementB 特有方法
   */
  public void operationB() {

  }
}
