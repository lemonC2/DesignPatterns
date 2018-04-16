package com.zss.java.singletonPattern;

/**
 * 单例模式：客户端测试类
 * @author lemon
 * @date 2018/4/16 13:39
 */
public class SingletonTest {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        LazySingleton lazy = LazySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (eagerSingleton == eagerSingleton1) {
            System.out.println("\"饿汉式单例模式\" 的两个对象是相等的！");
        }
        if (lazy == lazySingleton) {
            System.out.println("\"懒汉式单例模式\" 的两个对象是相等的！");
        }
        if (doubleCheckSingleton == doubleCheckSingleton1) {
            System.out.println("\"双重检查加锁模式单例模式\" 的两个对象是相等的！");
        }
        if (s1 == s2) {
            System.out.println("\"Lazy initialization holder class模式单例模式\" 的两个对象是相等的！");
        }

    }
}
