package com.zss.java.chainofresponsebilitypattern.example;

/**
 * 请求者类  ——请求者信息，根据该信息判断业务逻辑中对请求者执行的判断
 * @author lemon
 * @date 2018/4/19 15:33
 */
public class Request {
    private String requestType;  //申请类别
    private String requestContent; //申请内容
    private int  number ; //申请数量

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType='" + requestType + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", number=" + number +
                '}';
    }
}
