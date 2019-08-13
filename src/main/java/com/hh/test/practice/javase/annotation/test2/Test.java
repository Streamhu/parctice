package com.hh.test.practice.annotation.test2;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/8/12 11:24
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class stuClass = Class.forName("com.hh.test.practice.annotation.test2.Student");
        Method method = stuClass.getMethod("study");
        if(method.isAnnotationPresent(TestAnnotation.class)){
            System.out.println("Student类上配置了CherryAnnotation注解！");
            TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);
            System.out.println("name: " + testAnnotation.name() + "age" + testAnnotation.age());
        }
    }
}
