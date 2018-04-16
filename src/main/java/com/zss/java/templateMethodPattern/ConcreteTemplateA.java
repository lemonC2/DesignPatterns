package com.zss.java.templateMethodPattern;

/**
 * 具体模板类A
 * @author lemon
 * @date 2018/4/16 20:01
 */
public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体模板类A实现方法1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体模板类A实现方法2");
    }
}
