package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:03
 */
public class Gray implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
