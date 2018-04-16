package com.zss.java.decoratorpattern;

/**
 * 装饰模式：装饰角色
 * @author lemon
 * @date 2018/4/16 15:16
 */
public  abstract class Decorator implements Component {
    private Component component;
    public Decorator (Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        //委派给构建
        component.operation();
    }
}
