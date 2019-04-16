package com.hh.test.practice.design.builder;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 18:00
 */
public class Director {

    public Human createHumanByDirector(AbstractBuilder builder){
        builder.buildBody();
        builder.buildFoot();
        builder.buildHand();
        builder.buildHead();
        return builder.createHuman();
    }
}
