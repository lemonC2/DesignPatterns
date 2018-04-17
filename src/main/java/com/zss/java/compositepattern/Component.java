package com.zss.java.compositepattern;

/**
 * 抽象构建类:用于封装具体组合类方法和属性
 * @author lemon
 * @date 2018/4/17 17:37
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 添加一个子部件对象
     * @param c
     */
    public abstract void add(Component c);

    /**
     * 删除一个子部件对象
     * @param c
     */
    public abstract void remove(Component c);

    /**
     * 显示目录树
     * @param depth
     */
    public abstract void display(String depth);
}
