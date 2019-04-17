package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:01
 */
public class Rectangle extends Shape{

    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}
