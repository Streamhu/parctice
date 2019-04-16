package com.hh.test.practice.design.proxy;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 9:48
 */
public class Proxy implements AbstractSubject{

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        before();
        realSubject.request();
        after();
    }

    public void before(){
        System.out.println("在调用真实对象之前做一些处理");
    }

    public void after(){
        System.out.println("在调用真实对象之后做一些处理");
    }
}
