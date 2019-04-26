package com.hh.test.practice.design.mediator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:50
 */
public class Colleague1 extends Colleague{

    @Override
    public void receiver() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
