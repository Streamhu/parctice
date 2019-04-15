package com.hh.test.practice.design.factory;

import com.hh.test.practice.design.factory.simple.Mul;
import com.hh.test.practice.design.factory.simple.Operation;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:11
 */
public class MulFactory implements Factory {

    @Override
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new Mul();
    }
}
