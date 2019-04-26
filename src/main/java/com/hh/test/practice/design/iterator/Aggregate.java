package com.hh.test.practice.design.iterator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/20 8:29
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Interator getIterator();
}
