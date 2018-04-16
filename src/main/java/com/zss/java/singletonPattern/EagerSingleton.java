package com.zss.java.singletonPattern;

/**
 * 单例模式：饿汉式
 * @author lemon
 * @date 2018/4/16 11:45
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    //私有构造器
    private EagerSingleton(){}

    //静态工厂方法，获取全局唯一实例
    public static EagerSingleton getInstance(){
        return instance;
    }
}
