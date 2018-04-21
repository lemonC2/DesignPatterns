package com.zss.java.chainofresponsebilitypattern;

/**
 * 具体处理类A
 *若它所负责的请求，由于持有对下家的引用，所以可以访问它的后继者
 * 若可以处理该请求，就处理，否则将该请求转发给它的后继者
 * @author lemon
 * @date 2018/4/19 15:32
 */
public class ConcreteHandlerA  extends Handler{
    @Override
    protected void handlerRequest(int request) {
        if (request >= 0 && request < 10){
            System.out.println("处理0-10请求");
        }else{
            successor.handlerRequest(request); //请求下发到下一个请求处理者
        }
    }
}
