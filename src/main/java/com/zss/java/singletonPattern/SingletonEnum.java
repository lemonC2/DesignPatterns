package com.zss.java.singletonPattern;

/**
 * 单例模式：使用枚举实现单例模式
 * @author lemon
 * @date 2018/4/16 13:33
 */
public enum  SingletonEnum {

    //定义一个枚举的元素，它代表singletonEnum的一个实例
    uniqueInstance;

    //单例可以有自己的操作
    public void singletonOperation(){
        //功能实现
    }
}
