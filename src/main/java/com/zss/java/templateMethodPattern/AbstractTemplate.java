package com.zss.java.templateMethodPattern;

/**
 * 模板方法模式：抽象模板类
 * @author lemon
 * @date 2018/4/16 20:01
 */
public  abstract class AbstractTemplate {
    //模板方法
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteMethod();
    }

    //申明抽象基本方法，由子类具体实现
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();

    //基本方法
    private void concreteMethod() {
    }
}
