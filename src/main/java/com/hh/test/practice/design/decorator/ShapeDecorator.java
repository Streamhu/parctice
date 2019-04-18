package com.hh.test.practice.design.decorator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:46
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){}

}
