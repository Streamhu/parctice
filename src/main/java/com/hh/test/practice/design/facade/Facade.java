package com.hh.test.practice.design.facade;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 17:41
 */
public class Facade {

    private SubSystem1 sub1 = new SubSystem1();
    private SubSystem2 sub2 = new SubSystem2();
    private SubSystem3 sub3 = new SubSystem3();

    public void method(){
        sub1.method();
        sub2.method();
        sub3.method();
    }
}
