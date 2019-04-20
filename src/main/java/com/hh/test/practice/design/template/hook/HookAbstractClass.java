package com.hh.test.practice.design.template.hook;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 16:54
 */
public abstract class HookAbstractClass {

    public void templageMethod(){
        abstractMethod1();
        hookMethod1();
        if(hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }

    public void specificMethod(){
        System.out.println("钩子抽象类的具体方法被调用");
    }

    public void hookMethod1(){

    }

    public boolean hookMethod2(){
        return true;
    }

    abstract void abstractMethod1();

    abstract void abstractMethod2();
}
