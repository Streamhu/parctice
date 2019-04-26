package com.hh.test.practice.design.interpreter;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/25 8:47
 */
public class Interpreter {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("深圳的老人");
        bus.freeRide("深圳的年轻人");
        bus.freeRide("南昌的妇女");
        bus.freeRide("南昌的儿童");
        bus.freeRide("山东的儿童");
    }
}
