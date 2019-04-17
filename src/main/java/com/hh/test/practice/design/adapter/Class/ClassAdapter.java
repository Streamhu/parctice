package com.hh.test.practice.design.adapter.Class;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 14:46
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
