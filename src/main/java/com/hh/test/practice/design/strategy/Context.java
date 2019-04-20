package com.hh.test.practice.design.strategy;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 17:58
 */
public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void useStrategy(){
        strategy.strategyMethod();
    }
}
