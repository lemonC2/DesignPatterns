package com.zss.java.singletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式：懒汉式
 * @author lemon
 * @date 2018/4/16 11:48
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    //私有构造器
    private LazySingleton(){}

    //静态工厂方法，获取全局唯一实例
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
