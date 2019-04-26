package com.hh.test.practice.design.mediator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:49
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void receiver();

    public abstract void send();
}
