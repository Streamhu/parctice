package com.hh.test.practice.design.command;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 9:14
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(){
        System.out.println("调用者执行命令command ...");
        command.execute();
    }
}
