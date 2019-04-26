package com.hh.test.practice.design.state;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 11:30
 */
public class ConcereteStateA extends State{

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcereteStateB());
    }
}
