package com.zss.java.mementopattern;

/**
 * 备忘录：用于存储对象的状态数据
 * @author lemon
 * @date 2018/4/17 17:13
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
