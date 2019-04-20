package com.hh.test.practice.design.template;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 16:31
 */
public abstract class AbstractClass {

    public void templateMethod(){
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void specificMethod(){
        System.out.println("抽象类中的具体方法被调用");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();

}
