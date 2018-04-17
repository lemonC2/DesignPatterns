package com.zss.java.singletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式：懒汉式——第一次被引用时，才会将自己实例化
 * @author lemon
 * @date 2018/4/16 11:48
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    //私有构造器
    private LazySingleton(){}

    //静态工厂方法，获取全局唯一实例
    //该实例加锁防止多线程同时调用创建多个实例，但每次调用getInstance（）方法都使用lock，会造成性能消耗
    public static LazySingleton getInstance(){
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            if (instance == null){
                instance = new LazySingleton();
            }
        }finally {
            lock.unlock();
        }
        return instance;
    }

}
