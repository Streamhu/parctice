package com.hh.test.practice.design.builder;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 17:55
 */
public interface AbstractBuilder {

    public void buildHead();

    public void buildBody();

    public void buildHand();

    public void buildFoot();

    public Human createHuman();
}
