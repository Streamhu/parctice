package com.hh.test.practice.javase.annotation.test2;

import java.lang.annotation.*;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/8/12 10:12
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
public @interface TestAnnotation {

    String name();

    int age() default 18;

    int[] score() default {1,2};

}
