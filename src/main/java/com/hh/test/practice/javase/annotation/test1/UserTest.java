package com.hh.test.practice.annotation.test1;

import java.lang.reflect.InvocationTargetException;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/3 16:34
 */
public class UserTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user = UserFactory.create();
        System.out.println(user.getName());
        System.out.println(user.getAge());

        UserValidate userValidate = new UserValidate();
        userValidate.setName("haha");
        userValidate.setAge("1");

        System.out.println(UserCheck.check(userValidate));
    }
}
