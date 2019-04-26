package com.hh.test.practice.design.command;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 9:11
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(){
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
