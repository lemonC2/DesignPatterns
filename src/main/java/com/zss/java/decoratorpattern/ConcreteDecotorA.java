package com.zss.java.decoratorpattern;

/**
 * 装饰模式：具体装饰角色A
 * @author lemon
 * @date 2018/4/16 15:18
 */
public class ConcreteDecotorA extends Decorator {

    //本类的独有功能，区分ConcreteDecotorB

    private String addedState;
    public ConcreteDecotorA(Component component){
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedState = "new state";
        System.out.println("具体装饰对象A的操作！");
    }
}
