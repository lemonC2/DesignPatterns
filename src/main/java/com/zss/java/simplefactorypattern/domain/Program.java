package com.zss.java.simplefactorypattern.domain;

import java.util.Scanner;

/**
 * @author lemon
 * @date 2018/4/16 10:13
 */
public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入数字A：");
        String strNumberA = s.next();
        System.out.println("请选择运算符号(+、-、*、/):");
        String strOperate = s.next();
        System.out.println("请输入数字B：");
        String strNumberB = s.next();
        String result = null;
        switch (strOperate)
        {
            case "+":
                result = String.valueOf(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
                break;
            case "-":
                result = String.valueOf(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
                break;
            case "*":
                result = String.valueOf(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
                break;
            case "/":
                result = String.valueOf(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
                break;
        }
        System.out.println("-----------pengdh-----------result值=" + result + "," + "当前类=Program.main()");
    }
}
