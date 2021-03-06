package com.hh.test.practice.javase.annotation.test1;

import java.lang.reflect.Field;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/3 16:55
 */
public class UserCheck {

    public static boolean check(UserValidate user){
        if(user == null){
            System.out.println("检验对象为空");
            return false;
        }

        // 获取User类的所有属性（如果使用getFields，就无法获取到private的属性）
        Field[] fields = UserValidate.class.getDeclaredFields();

        for(Field field : fields){
            // 如果属性有注解，就进行校验
            if(field.isAnnotationPresent(Validate.class)){
                Validate validate = field.getAnnotation(Validate.class);
                if(field.getName().equals("age")){
                    if (user.getAge() == null) {
                        if (validate.isNotNull()) {
                            System.out.println("！！年龄可空校验不通过：不可为空！！");
                            return false;
                        } else {
                            System.out.println("年龄可空校验通过：可以为空");
                            continue;
                        }
                    } else {
                        System.out.println("年龄可空校验通过");
                    }

                    if (user.getAge().length() < validate.min()) {
                        System.out.println("！！年龄最小长度校验不通过！！");
                        return false;
                    } else {
                        System.out.println("年龄最小长度校验通过");
                    }if (user.getAge().length() > validate.max()) {
                        System.out.println("！！年龄最大长度校验不通过！！");
                        return false;
                    } else {
                        System.out.println("年龄最大长度校验通过");
                    }
                }
            }
        }

        return true;
    }

}
