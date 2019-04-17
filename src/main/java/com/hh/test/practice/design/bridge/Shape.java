package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 15:58
 */
public abstract class Shape {

    Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw();
}
