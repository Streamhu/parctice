package com.hh.test.practice.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Validate {

    public int min() default 1;

    public int max() default 10;

    public boolean isNotNull() default true;
}
