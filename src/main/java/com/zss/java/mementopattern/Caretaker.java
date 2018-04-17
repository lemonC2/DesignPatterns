package com.zss.java.mementopattern;

/**
 * 管理者列
 * @author lemon
 * @date 2018/4/17 17:13
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
