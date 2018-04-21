package com.zss.java.chainofresponsebilitypattern;

/**
 * 抽象处理者
 * 定义出一个处理请求的接口，若需要，接口可定义出一个方法以设定和返回对下家的引用
 *
 * @author lemon
 * @date 2018/4/19 15:31
 */
public abstract class Handler {

    protected  Handler successor;

    //持有对下家的引用
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //请求处理
    protected abstract void handlerRequest(int request);
}
