package com.zss.java.iteratorPattern;

/**
 * 迭代器模式：迭代器抽象类
 */
public abstract class Iterator {

  /**
   * 移动到第一个元素
   */
  public abstract void first();

  /**
   * 移动到下一个元素
   */
  public abstract void next();

  /**
   * 判读是否为最后一个元素
   */
  public abstract boolean isDone();

  /**
   * 返还当前元素
   */
  public abstract Object currentItem();
}
