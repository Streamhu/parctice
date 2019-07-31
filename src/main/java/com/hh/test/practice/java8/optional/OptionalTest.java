package com.hh.test.practice.java8.optional;

import java.util.Optional;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/31 14:27
 */
public class OptionalTest {

    public static void main(String[] args) {


    }

    public static String test1(User user){
        // 原来写法
        if(user == null){
            return "Unkown";
        }
        return user.getName();
    }

    public static Integer new1(User user){
        // 会根据最后一个map获取返回类型
        return  Optional.ofNullable(user).filter(u -> u.getId() > 0).map(u -> u.getName()).map(name -> Integer.valueOf(name)).orElseGet(() -> 123);
    }

}
