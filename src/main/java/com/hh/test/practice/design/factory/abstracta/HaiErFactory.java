package com.hh.test.practice.design.factory.abstracta;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:40
 */
public class HaiErFactory implements AbstractFactory{

    @Override
    public Refrigerator createRefrigerator() {
        return new HaiErRefrigerator();
    }

    @Override
    public Conditioner createConditioner() {
        return new HaiErConditioner();
    }
}
