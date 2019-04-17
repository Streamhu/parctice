package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:02
 */
public class Square extends Shape{

    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
