package com.zss.java.decoratorpattern;

/**
 * @author lemon
 * @date 2018/4/16 15:15
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
