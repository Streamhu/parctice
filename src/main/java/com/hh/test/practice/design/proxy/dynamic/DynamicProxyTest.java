package com.hh.test.practice.design.proxy.dynamic;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 10:28
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        ZhouXingChiProxy zxcProxyUtil = new ZhouXingChiProxy();
        // 获得代理对象
        Person proxy = zxcProxyUtil.getProxy();
        // 代理对象类名 com.sun.proxy.$Proxy0
        System.out.println(proxy.getClass());
        // 调用代理的sing方法
        String value1 = proxy.sing("007");
        System.out.println(value1);
        // 调用代理对象的dance方法
        String value2 = proxy.dance("海草舞");
        System.out.println(value2);
    }
}
