package com.zss.java.decoratorpattern;

/**
 * 装饰模式：具体装饰角色B
 * @author lemon
 * @date 2018/4/16 15:18
 */
public class ConcreteDecotorB extends Decorator {

    public ConcreteDecotorB(Component component){
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作！");
    }

    private void addedBehavior(){

    }

}
