package com.hh.test.practice.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/3 16:27
 */
public class UserFactory {

    public static User create() throws InvocationTargetException, IllegalAccessException {

        User user = new User();

        // 获取User类中所有的方法
        Method[] methods = User.class.getMethods();

        for(Method method : methods){
            // 如果方法有注解，就把注解里面的数据复制到user对象
            if(method.isAnnotationPresent(Init.class)){
                Init init = method.getAnnotation(Init.class);
                method.invoke(user, init.value());
            }
        }
        return user;
    }

}
