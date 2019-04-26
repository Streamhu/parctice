package com.hh.test.practice.design.mediator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:56
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new Colleague1();
        Colleague colleague2 = new Colleague2();

        mediator.register(colleague1);
        mediator.register(colleague2);

        colleague1.send();
        System.out.println("-------------");
        colleague2.send();
    }
}
