package com.hh.test.practice.javase.annotation.test1;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Init {

    public String value() default "";
}
