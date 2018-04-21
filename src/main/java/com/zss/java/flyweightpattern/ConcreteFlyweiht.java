package com.zss.java.flyweightpattern;

/**
 *具体享元类
 * @author lemon
 * @date 2018/4/19 17:18
 */
public class ConcreteFlyweiht extends Flyweight {

    //持有一个内部状态
    private String intrinsicstate;

    //构造函数，内部状态作为参数传入
    public ConcreteFlyweiht(String intrinsicstate) {
        this.intrinsicstate = intrinsicstate;
    }

    /**
     * 外部状态作为参数传入方法中
     * 改变了方法的行为，但是并不改变对象的内部状态
     * @param extrinsicstate  外部状态
     */
    @Override
    public void operation(int extrinsicstate) {
        System.out.println(intrinsicstate);
        System.out.println(extrinsicstate);
    }
}
