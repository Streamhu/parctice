package com.hh.test.practice.design.combination;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/17 8:48
 */
public interface Component {

    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();

}
