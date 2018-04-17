package com.zss.java.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象出题类
 * @author lemon
 * @date 2018/4/17 11:44
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 发布通知
     */
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
