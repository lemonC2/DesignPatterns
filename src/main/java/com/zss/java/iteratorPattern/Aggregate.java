package com.zss.java.iteratorPattern;

/**
 * 迭代器模式：聚集抽象类
 */
public abstract class Aggregate {

  /**
   * 工厂方法，创建相应迭代器对象的
   */
  public abstract Iterator createIterator();
}
