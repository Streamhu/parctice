package com.hh.test.practice.design.memo;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/24 8:32
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento m){
        this.setState(m.getState());
    }
}
