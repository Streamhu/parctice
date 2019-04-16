package com.hh.test.practice.design.builder;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 18:02
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHumanByDirector(new Builder());
        System.out.println(human.getBody());
        System.out.println(human.getFoot());
        System.out.println(human.getHand());
        System.out.println(human.getHead());
    }
}
