package com.hh.test.practice.design.prototype;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 11:05
 */
public interface Shape extends Cloneable{

    Object clone();

    void countArea();
}
