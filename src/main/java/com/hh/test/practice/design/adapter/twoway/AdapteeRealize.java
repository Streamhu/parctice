package com.hh.test.practice.design.adapter.twoway;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 15:23
 */
public class AdapteeRealize implements TwowayAdaptee {

    @Override
    public void specificRequest() {
        System.out.println("双向适配的适配者");
    }
}
