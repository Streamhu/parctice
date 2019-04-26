package com.hh.test.practice.design.mediator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:50
 */
public class Colleague2 extends Colleague{

    @Override
    public void receiver() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
