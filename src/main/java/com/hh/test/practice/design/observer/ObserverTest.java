package com.hh.test.practice.design.observer;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:17
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);

        subject.add(observer2);

        subject.notifyObserver();
    }
}
