package com.hh.test.practice.design.bridge;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 16:05
 */
public class Client {

    public static void main(String[] args) {
        // 白色
        Color white = new White();
        // 正方形
        Shape square = new Square();
        // 白色的正方形
        square.setColor(white);
        square.draw();

        // 长方形
        Shape retange = new Rectangle();
        retange.setColor(white);
        retange.draw();
    }
}
