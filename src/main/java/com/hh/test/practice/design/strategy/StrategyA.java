package com.hh.test.practice.design.strategy;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 17:57
 */
public class StrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("策略A的算法被调用");
    }
}
