package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:03
 */
public class White implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
