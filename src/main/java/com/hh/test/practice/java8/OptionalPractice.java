package com.hh.test.practice.java8;

import java.util.Optional;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/2/1 9:55
 */
public class OptionalPractice {

    public static void main(String[] args)throws Exception {
        OptionalPractice test = new OptionalPractice();
        UserForOptional user1 = null;
        // orElse 和 orElseGet方法差不多（为空则取默认值）
        user1 = Optional.ofNullable(user1).orElse(test.createUser());
        System.out.println("姓名 = " + user1.getName());
        // orElseThrow 为空则可以做其他操作（比如抛异常）
        UserForOptional user2 = null;
        // Optional.ofNullable(user2).orElseThrow(()-> new Exception("用户不存在"));
        // map用法
        String name = Optional.ofNullable(user1).map( a -> a.getName()).get();
        System.out.println("map姓名 = " + name);
        // filter用法
        Optional<UserForOptional> user3 = Optional.ofNullable(user1).filter( a -> a.getName().length()<6);

    }

    public UserForOptional createUser(){
        UserForOptional user = new UserForOptional();
        user.setName("hello");
        return user;
    }

}
