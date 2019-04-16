package com.hh.test.practice.design.builder;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 17:57
 */
public class Builder implements AbstractBuilder{

    private Human human = new Human();

    @Override
    public void buildHead() {
        human.setHead("性感的大脑");
    }

    @Override
    public void buildBody() {
        human.setBody("强壮的身体");
    }

    @Override
    public void buildHand() {
        human.setHand("粗壮的大手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("笔直的大腿");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
