package com.hh.test.practice.design.command;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 9:17
 */
public class CommonTest {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Command command = new ConcreteCommand();
        invoker.setCommand(command);

        invoker.call();
    }
}
