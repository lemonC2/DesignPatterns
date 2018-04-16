package com.zss.java.decoratorpattern;

/**
 * 装饰模式：客户端测试类
 * @author lemon
 * @date 2018/4/16 15:22
 */
public class TestDecotorPattern {

    /**
     * 装饰的方法，首先用ConcreteComponent 实例化对象C
     * 然后用ConcreteDecotorA 的实例化对象a来包装C
     * 再用ConcreteDecotorB的实例化对象B来包装a
     * 最终执行B的operation（）方法
     * @param args
     */
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecotorA a = new ConcreteDecotorA(c);
        ConcreteDecotorB b = new ConcreteDecotorB(a);
        b.operation();
    }

}
