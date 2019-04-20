package com.hh.test.practice.design.strategy;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 17:59
 */
public class StrategyTest {

    public static void main(String[] args) {

        Context context = new Context();

        Strategy a = new StrategyA();
        context.setStrategy(a);
        context.useStrategy();

        System.out.println("-----------------");

        Strategy b = new StrategyB();
        context.setStrategy(b);
        context.useStrategy();

    }
}
