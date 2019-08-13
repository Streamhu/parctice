package com.hh.test.practice.javase.proxydemo;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/8/13 11:22
 */
public class MainTest {

    public static void main(String[] args) {
        // 原始方法
        // simple1();
        // 匿名内部类
        // simple2();
        // java8的写法
        // java8();
        // 测试cglib代理（没有接口）
        cglib();
    }

    private static void cglib(){
        Programmer programmer = new Programmer();
        Hacker hacker = new Hacker();
        // cglib 中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        // 设置父类，即要创建动态代理的类
        enhancer.setSuperclass(programmer.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(hacker);
        Programmer proxy = (Programmer)enhancer.create();
        proxy.code();
    }

    private static void java8(){
        // 我们要代理的真实对象
        Subject realSubject = new RealSubject();
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("代理之前");
            method.invoke(realSubject, args);
            System.out.println("代理之后");
            return null;
        });
        subject.rent();
        subject.hello("world");
    }

    private static void simple2(){
        // 我们要代理的真实对象
        Subject realSubject = new RealSubject();
        Subject subject = (Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理之前");
                method.invoke(realSubject, args);
                System.out.println("代理之后");
                return null;
            }
        });

        subject.rent();
        subject.hello("world");

    }

    private static void simple1(){
        // 我们要代理的真实对象
        Subject realSubject = new RealSubject();

        // 我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        InvocationHandler handler = new DynamicProxy(realSubject);

        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);

        System.out.println(subject.getClass().getName());
        subject.rent();
        subject.hello("world");
    }
}
