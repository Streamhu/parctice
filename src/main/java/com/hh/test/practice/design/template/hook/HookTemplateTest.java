package com.hh.test.practice.design.template.hook;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 16:59
 */
public class HookTemplateTest {

    public static void main(String[] args) {
        HookAbstractClass test = new HookConcreteClass();
        test.templageMethod();
    }
}
