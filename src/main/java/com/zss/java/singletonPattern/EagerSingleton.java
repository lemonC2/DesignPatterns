package com.zss.java.singletonPattern;

/**
 * 单例模式：饿汉式
 * 静态初始化——不需开发人员显示地编写线程安全代码，即可解决多线程环境下它是不安全的问题。
 *
 * 静态初始化的方式是在自己被加载时就将自己实例化——饿汉式单例类
 *
 * 全局访问和实例化控制
 * 公共静态属性为访问实例提供了一个全局访问点。
 *由于构造方法是私有的，因此不能在类本身以外实例化；因此变量引用的是可以在系统中存在的唯一的实例。
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
