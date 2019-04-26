package com.hh.test.practice.design.memo;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/24 8:36
 */
public class Manager {

    private Memento memento;

    public void setMemento(Memento m){
        memento = m;
    }

    public Memento getMemento(){
        return memento;
    }
}
