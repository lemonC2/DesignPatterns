package com.zss.java.chainofresponsebilitypattern.example;

/**
 * 经理类
 * @author lemon
 * @date 2018/4/19 15:32
 */
public class CommonManger extends Manager {

    public CommonManger(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name +"："  + request.getRequestContent() + request.getNumber() + "被批准");
        } else if (getSuperior() != null) {
            getSuperior().requestApplications(request);
        }
    }
}
