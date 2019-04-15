package com.hh.test.practice.design.factory;

import com.hh.test.practice.design.factory.simple.Operation;
import com.hh.test.practice.design.factory.simple.Sub;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:11
 */
public class SubFactory implements Factory {

    @Override
    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}
