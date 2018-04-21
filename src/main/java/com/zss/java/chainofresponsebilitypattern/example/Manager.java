package com.zss.java.chainofresponsebilitypattern.example;

/**
 * 管理者类——设置层级关系，便于职责链的连接（下一级处理不了则推到上一级，若上一级也处理不了则再次推到上一级）
 * @author lemon
 * @date 2018/4/19 15:34
 */
public abstract class Manager {
    protected String name;
    //管理者上级
    protected  Manager superior;

    public Manager(String name) {
        this.name = name;
    }
    //获取上级
    public Manager getSuperior() {
        return superior;
    }
//设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
    //下一个请求处理者
    public abstract void requestApplications(Request request);
}
