package com.hh.test.practice.design.adapter.Class;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 14:47
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
