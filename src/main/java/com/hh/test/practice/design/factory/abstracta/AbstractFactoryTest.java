package com.hh.test.practice.design.factory.abstracta;

import com.hh.test.practice.design.factory.Factory;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:48
 */
public class AbstractFactoryTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        AbstractFactory haiErFactory = (AbstractFactory) Class.forName("com.hh.test.practice.design.factory.abstracta.HaiErFactory").newInstance();
        AbstractFactory meiDiFactory = (AbstractFactory) Class.forName("com.hh.test.practice.design.factory.abstracta.MeiDiFactory").newInstance();

        Refrigerator haiErRefrigerator = haiErFactory.createRefrigerator();
        Refrigerator meiDiRefrigerator = meiDiFactory.createRefrigerator();

        haiErRefrigerator.useRefrigerator();
        meiDiRefrigerator.useRefrigerator();

        Conditioner haiErConditioner = haiErFactory.createConditioner();
        Conditioner meiDiConditioner = meiDiFactory.createConditioner();

        haiErConditioner.userConditioner();
        meiDiConditioner.userConditioner();

    }
}
