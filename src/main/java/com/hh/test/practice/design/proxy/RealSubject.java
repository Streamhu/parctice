package com.hh.test.practice.design.proxy;


/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 9:47
 */
public class RealSubject implements AbstractSubject {

    @Override
    public void request() {
        System.out.println("访问真实主题方法");
    }
}
