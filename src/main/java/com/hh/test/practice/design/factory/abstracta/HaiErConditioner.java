package com.hh.test.practice.design.factory.abstracta;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:44
 */
public class HaiErConditioner implements Conditioner{

    @Override
    public void userConditioner() {
        System.out.println("正在使用海尔空调");
    }
}
