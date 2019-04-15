package com.hh.test.practice.design.factory.simple;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 11:10
 */
public class Div implements  Operation{

    // 除法计算
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new Exception("除数不能为0！");
        }
        return numberA / numberB;
    }

}
