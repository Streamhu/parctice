package com.hh.test.practice.design.adapter;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 14:34
 */
public class ObjectAdaptor implements Target{

    private Adaptee adaptee;

    public ObjectAdaptor(Adaptee adaptee){
        this.adaptee =adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
