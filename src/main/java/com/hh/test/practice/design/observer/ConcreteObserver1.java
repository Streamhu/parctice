package com.hh.test.practice.design.observer;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:11
 */
public class ConcreteObserver1 implements Observer{

    @Override
    public void response() {
        System.out.println("具体观察者1做出反应");
    }
}
