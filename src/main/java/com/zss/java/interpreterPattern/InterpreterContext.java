package com.zss.java.interpreterPattern;

/**
 * 环境
 * @author lemon
 * @date 2018/4/21 10:06
 */
public class InterpreterContext {

    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "InterpreterContext{" +
                "input='" + input + '\'' +
                ", output='" + output + '\'' +
                '}';
    }
}
