package com.zss.java.singletonPattern;

/**
 * 单例模式：lazy initialization holder class 模式
 *
 * @author lemon
 * @date 2018/4/16 11:53
 */
public class Singleton {
    //私有构造器
    private Singleton() {
    }

    /**
     * 类级的内部类，即静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，且只有被调用到时才会装载，从而实现延迟加载。
     */
    private static class singletonHolder {
        //静态初始化，由JVM保证线程安全
        private static Singleton singleton = new Singleton();
    }

    //静态工厂方法，获取全局唯一实例
    public static Singleton getInstance() {
        return singletonHolder.singleton;
    }
}
