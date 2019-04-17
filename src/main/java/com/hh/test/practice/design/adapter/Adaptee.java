package com.hh.test.practice.design.adapter;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 14:31
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("我是适配者，我有自己的方法，但可以通过适配器调用");
    }
}
