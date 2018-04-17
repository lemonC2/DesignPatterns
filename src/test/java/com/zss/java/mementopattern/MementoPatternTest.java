package com.zss.java.mementopattern;

/**
 * @author lemon
 * @date 2018/4/17 17:16
 */
public class MementoPatternTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 改变发起人对象状态
        originator.setState("On");
        originator.show();
        // 创建备忘录对象
        Memento memento = originator.createMemento();
        // 保存发起人状态
        caretaker.setMemento(memento);
        // 改变发起人状态
        originator.setState("Off");
        originator.show();
        // 恢复发起人状态
        originator.restoreMemento(memento);
        originator.show();
    }
}
