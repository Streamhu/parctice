package com.hh.test.practice.javase.generic;

import java.util.*;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/2/11 10:26
 */
public class GenericTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenericTest test = new GenericTest();
        test.testEquals();// 返回true
        test.testClass();
        test.testNotType();
        test.testMethod(test.getClass());
    }

    /**
     * 测试不同的泛型实参，类型是否相同
     * */
    public void testEquals(){
        List<String> stringList = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>();
        Boolean flag = stringList.getClass().equals(integerList.getClass());
        System.out.println("flag=" + flag);
    }

    /**
     * 测试泛型类
     * */
    public void testClass(){
        Generic<Integer> integerGeneric = new Generic<>(123);
        Generic<String> stringGeneric = new Generic<>("aaa");
        System.out.println("泛型类测试，key = " + integerGeneric.getKey());
        System.out.println("泛型类测试，key = " + stringGeneric.getKey());
    }

    /**
     * 不指定类型实参的情况，可以是任意类型
     * */
    public void testNotType(){
        Generic g1 = new Generic("123");
        Generic g2 = new Generic(123);
        Generic g3 = new Generic(12.3);
        Generic g4 = new Generic(false);
        System.out.println("泛型类测试，key = " + g1.getKey());
        System.out.println("泛型类测试，key = " + g2.getKey());
        System.out.println("泛型类测试，key = " + g3.getKey());
        System.out.println("泛型类测试，key = " + g4.getKey());
    }

    /**
     * 测试泛型方法
     * */
    public <T> T testMethod(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T instance = tClass.newInstance();
        return instance;
    }
}
