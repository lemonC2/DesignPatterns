package com.zss.java.visitorPattern;

/**
 * 访问者模式：具体访问者1
 */
public class ConcreteVisitor1 extends Visitor {

  @Override
  public void visitConcreteElementA(ConcreteElementA concreteElementA) {
    System.out.println(ConcreteElementA.class.getSimpleName() + " 被 " + this.getClass().getSimpleName() + " 访问！");
  }

  @Override
  public void visitConcreteElementB(ConcreteElementB concreteElementB) {
    System.out.println(ConcreteElementB.class.getSimpleName() + " 被 " + this.getClass().getSimpleName() + " 访问！");
  }
}
