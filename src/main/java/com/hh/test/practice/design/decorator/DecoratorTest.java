package com.hh.test.practice.design.decorator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:50
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(circle);

        Shape rectangle = new Rectangle();

        Shape redRectangle = new RedShapeDecorator(rectangle);

        redCircle.draw();
        redRectangle.draw();
    }
}
