package com.hh.test.practice.javase.proxydemo;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/8/13 15:37
 */
public class Hacker implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("**** I am a hacker,Let's see what the poor programmer is doing Now...");
        methodProxy.invokeSuper(o, objects);
        System.out.println("****  Oh,what a poor programmer.....");
        return null;
    }
}
