package com.hh.test.practice.design.state;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 11:30
 */
public class ConcereteStateB extends State{

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcereteStateA());
    }
}
