package com.hh.test.practice.design.adapter;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 14:36
 */
public class AdapterTest {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdaptor(adaptee);
        target.request();
    }
}
