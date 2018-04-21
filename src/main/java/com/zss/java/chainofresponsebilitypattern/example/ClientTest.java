package com.zss.java.chainofresponsebilitypattern.example;

/**
 * 客户端测试类
 * @author lemon
 * @date 2018/4/19 15:32
 */
public class ClientTest {
    public static void main(String[] args) {
        // 组装责任链  经理---总监----总经理
        CommonManger jingli = new CommonManger("经理");
        MajorDomo zongjian = new MajorDomo("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");
        //设置上下 级关系
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        //不同的请求参数，处理人（处理人的岗位）不同
        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jingli.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jingli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        jingli.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        jingli.requestApplications(request4);

    }
}
