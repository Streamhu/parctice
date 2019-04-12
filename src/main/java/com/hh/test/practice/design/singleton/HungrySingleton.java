package com.hh.test.practice.design.singleton;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 8:05
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
