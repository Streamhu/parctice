package com.hh.test.practice.design.factory.abstracta;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:47
 */
public class MeiDiFactory implements AbstractFactory{

    @Override
    public Refrigerator createRefrigerator() {
        return new MeiDiRefrigerator();
    }

    @Override
    public Conditioner createConditioner() {
        return new MeiDiContioner();
    }
}
