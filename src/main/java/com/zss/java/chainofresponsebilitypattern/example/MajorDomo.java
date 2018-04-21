package com.zss.java.chainofresponsebilitypattern.example;

/**
 * 总监类
 * @author lemon
 * @date 2018/4/19 15:32
 */
public class MajorDomo  extends Manager{

    public MajorDomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5){
            System.out.println(name+": " +request.getRequestContent() +request.getNumber() + "被批准");
        }else if(getSuperior() != null){  //获取上一级
            getSuperior().requestApplications(request);  //将请求传到上一级处理
        }
    }
}
