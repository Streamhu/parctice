package com.hh.test.practice.design.factory.simple;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 11:10
 */
public class Add implements Operation{

    // 加法计算
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }

}
