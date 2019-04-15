package com.hh.test.practice.design.factory;

import com.hh.test.practice.design.factory.simple.Operation;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:09
 */
public interface Factory {

    public Operation createOperation();
}
