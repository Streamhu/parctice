package com.hh.test.practice.design.template.hook;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 16:57
 */
public class HookConcreteClass extends HookAbstractClass{

    @Override
    void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean hookMethod2()
    {
        return false;
    }

}
