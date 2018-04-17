package com.zss.java.statepattern;

/**
 * 环境类：实现对状态实例对象的封装
 * @author lemon
 * @date 2018/4/17 15:40
 */
public class Context {

    private State state;
    public Context(State state){
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //对请求做处理并设置下一状态
    public void request(){
        state.handle(this);
    }
}
