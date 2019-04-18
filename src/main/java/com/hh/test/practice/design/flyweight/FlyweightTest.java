package com.hh.test.practice.design.flyweight;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 18:15
 */
public class FlyweightTest {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");
        f01.operation(new UnshareFlyweight("第1次调用a。"));
        f02.operation(new UnshareFlyweight("第2次调用a。"));
        f03.operation(new UnshareFlyweight("第3次调用a。"));
        f11.operation(new UnshareFlyweight("第1次调用b。"));
        f12.operation(new UnshareFlyweight("第2次调用b。"));
    }
}
