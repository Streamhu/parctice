package com.hh.test.practice.javase.proxydemo;

/**
 * 真实对象
 *
 * @author huhui
 * @since 2019/8/13 11:07
 */
public class RealSubject implements Subject{

    @Override
    public void rent()
    {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str)
    {
        System.out.println("hello: " + str);
    }
}
