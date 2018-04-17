package com.zss.java.facadepattern;

/**
 * 外观模式：门面类
 * @author lemon
 * @date 2018/4/17 10:18
 */
public class Facade {
    private FacadeModuleA subModuleA;
    private FacadeModuleB subModuleB;
    private FacadeModuleC subModuleC;

    //初始化子类
    public Facade() {
        this.subModuleA = new FacadeModuleA();
        this.subModuleB = new FacadeModuleB();
        this.subModuleC = new FacadeModuleC();
    }

    /**
     * facade 外观模式在门面类里组合子类方法，实现对子类方法的调用，完成业务逻辑实现
     * 这将在外部调用接口时只接触门面类不用知道内部实现细节或内部实现对外部调用用户是透明的
     */
    //组合调用子类方法
    public void testFacade() {
        subModuleA.methodA();
        subModuleB.methodB();
        subModuleC.methodC();
    }
}
