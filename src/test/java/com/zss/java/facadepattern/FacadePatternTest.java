package com.zss.java.facadepattern;

/**
 * @author lemon
 * @date 2018/4/17 10:23
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        Facade facade = new Facade();  //在这步调用时，会同时初始化子类实例
        facade.testFacade();
    }
}
