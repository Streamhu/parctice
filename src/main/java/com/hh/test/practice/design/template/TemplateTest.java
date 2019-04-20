package com.hh.test.practice.design.template;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 16:36
 */
public class TemplateTest {

    public static void main(String[] args) {
        AbstractClass test = new ConcreteClass();
        test.templateMethod();
    }
}
