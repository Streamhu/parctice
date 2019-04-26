package com.hh.test.practice.design.memo;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/24 8:29
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
