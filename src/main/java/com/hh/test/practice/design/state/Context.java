package com.hh.test.practice.design.state;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 11:29
 */
public class Context {

    private State state;

    // 定义环境的初始状态
    public Context(){
        this.state = new ConcereteStateA();
    }

    // 设置新状态
    public void setState(State state){
        this.state = state;
    }

    // 读取状态
    public State getState(){
        return this.state;
    }

    // 对请求做出处理
    public void Handle(){
        state.Handle(this);
    }
}
