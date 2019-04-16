package com.hh.test.practice.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 10:23
 */
public class ZhouXingChiProxy {

    // 设计一个类变量记住代理类要代理的目标对象
    private Person zxc = new ZhouXingChi();

    public Person getProxy(){
        return (Person)Proxy.newProxyInstance(ZhouXingChi.class.getClassLoader(), zxc.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method = " + method);
                System.out.println("args = " + args);
                // 如果调用的是代理对象的sing方法
                if(method.getName().equals("sing")){
                    System.out.println("我是他的经纪人，要找他唱歌得先给十万块钱！！");
                    return method.invoke(zxc, args);
                }
                if(method.getName().equals("dance")){
                    System.out.println("我是他的经纪人，要找他跳舞得先给二十万块钱！！");
                    return method.invoke(zxc, args);// 代理对象调用真实目标对象的dance方法去处理用户请求
                }

                return null;
            }
        });
    }
}
