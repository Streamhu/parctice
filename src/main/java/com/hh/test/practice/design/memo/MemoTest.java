package com.hh.test.practice.design.memo;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/24 8:37
 */
public class MemoTest {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Manager manager = new Manager();

        originator.setState("state 0");
        System.out.println("初始状态 = " + originator.getState());

        manager.setMemento(originator.createMemento());

        originator.setState("state 1");
        System.out.println("新的状态 = " + originator.getState());

        originator.restoreMemento(manager.getMemento());
        System.out.println("恢复状态 = " + originator.getState() );
    }

}
