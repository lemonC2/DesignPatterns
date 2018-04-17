package com.zss.java.observerpattern;

/**
 * 测试类
 * 缺点：观察者和主题类存在耦合
 * 解决：将主题类改为接口，且利用委托实现解耦
 * @author lemon
 * @date 2018/4/17 11:47
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("obs1", s));
        s.attach(new ConcreteObserver("obs2", s));

        s.setSubjectState("new state");
        s.notifyObservers();
    }
}
