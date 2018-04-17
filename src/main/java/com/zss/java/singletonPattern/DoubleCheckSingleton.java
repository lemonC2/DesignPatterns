package com.zss.java.singletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式：双重检查加锁
 * @author lemon
 * @date 2018/4/16 13:35
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance = null;

    //私有构造器
    private DoubleCheckSingleton() {
    }

    //静态工厂方法，获取全局唯一实例
    /**
     *该方法加锁实现的是：只是在实例未被创建的时候再加锁处理，同时保证多线程的安全
     * 两次判断instance == null 是因为：当instance存在时，直接返回，是OK的
     * 但是当instance为null时且同时有两个线程调用getInstance（）方法时，它们都会通过第一次的instance == null判断，然后由lock机制
     * 则两个线程则只有一个进入，另一个则排队等候。若没有第二重的instance == null 则第一个线程创建了实例，第二个线程还是可继续
     * 创建新的实例，则没有达到单例的目的
     */
    public static DoubleCheckSingleton getInstance(){
        //先检查实例是否存在，若不存在才进入下面的同步块
        if (instance == null ){
            //加锁，线程安全的创建实例
            Lock lock = new ReentrantLock();
            lock.lock();
            try {
                //再次检查实例是否存在，若不存在才真正的创建实例
                if (instance == null ){
                    instance = new DoubleCheckSingleton();
                }
            }finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
