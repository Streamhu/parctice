package com.hh.test.practice.design.adapter.twoway;

import com.hh.test.practice.design.adapter.Class.Target;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 15:21
 */
public class TargetRealize implements TwowayTraget{

    @Override
    public void request() {
        System.out.println("双向适配的target");
    }
}
