package com.hh.test.practice.design.factory.abstracta;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:34
 */
public interface AbstractFactory {

    Refrigerator createRefrigerator();

    Conditioner createConditioner();
}
