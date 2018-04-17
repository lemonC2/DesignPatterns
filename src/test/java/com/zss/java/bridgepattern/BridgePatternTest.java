package com.zss.java.bridgepattern;

/**
 * 桥接模式：客户端测试类
 */
public class BridgePatternTest {

  public static void main(String[] args) {
    Abstraction ab1 = new RefinedAbstraction(new ImplementorA());
    ab1.operation();
    Abstraction ab2 = new RefinedAbstraction(new ImplementorB());
    ab2.operation();
  }
}
