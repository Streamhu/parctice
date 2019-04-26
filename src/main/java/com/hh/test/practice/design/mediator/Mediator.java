package com.hh.test.practice.design.mediator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:48
 */
public interface Mediator {

    void register(Colleague colleague);

    void relay(Colleague colleague);
}
