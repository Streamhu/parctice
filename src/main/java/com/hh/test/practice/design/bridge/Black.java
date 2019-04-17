package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:04
 */
public class Black implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
