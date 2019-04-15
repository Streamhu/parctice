package com.hh.test.practice.design.factory;

import com.hh.test.practice.design.factory.simple.Add;
import com.hh.test.practice.design.factory.simple.Operation;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:11
 */
public class AddFactory implements Factory {

    @Override
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
