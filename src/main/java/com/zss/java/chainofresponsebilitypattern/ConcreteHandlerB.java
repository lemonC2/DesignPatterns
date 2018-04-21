package com.zss.java.chainofresponsebilitypattern;

/**
 * 具体请求的处理者类B
 * @author lemon
 * @date 2018/4/19 15:32
 */
public class ConcreteHandlerB extends Handler {
    @Override
    protected void handlerRequest(int request) {
        //符合处理类B处理逻辑则B类处理，否则就将请求向下转移到其他处理类处理
        if (request >= 10 && request < 20){
            System.out.println("处理10-20的请求");
        }else{
            //转移到后续者类处理
            successor.handlerRequest(request);
        }
    }
}
