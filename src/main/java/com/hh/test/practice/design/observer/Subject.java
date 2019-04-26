package com.hh.test.practice.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:12
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    // 增加观察者方法
    public void add(Observer observer){
        observers.add(observer);
    }

    // 删除观察者方法
    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();



}
