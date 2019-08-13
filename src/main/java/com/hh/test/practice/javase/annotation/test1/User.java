package com.hh.test.practice.javase.annotation.test1;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/3 16:24
 */
public class User {

    private String name;
    private String age;

    public String getName()
    {
        return name;
    }

    @Init(value = "hello test")
    public void setName(String name){
        this.name = name;
    }

    public String getAge(){
        return age;
    }

    @Init(value = "27")
    public void setAge(String age){
        this.age = age;
    }
}
