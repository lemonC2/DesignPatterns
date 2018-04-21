package com.zss.java.flyweightpattern;

/**
 * 抽象享元类
 * @author lemon
 * @date 2018/4/19 17:19
 */
public  abstract class Flyweight {

    /**
     * 外部状态作为参数传入方法中
     * 改变了方法的行为，但是并不改变对象的内部状态
     * @param extrinsicstate  外部状态
     */
    public abstract void operation(int extrinsicstate);

}
