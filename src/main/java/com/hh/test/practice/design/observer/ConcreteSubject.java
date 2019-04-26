package com.hh.test.practice.design.observer;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:15
 */
public class ConcreteSubject extends Subject{

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for(Observer observer : observers){
            observer.response();
        }
    }
}
