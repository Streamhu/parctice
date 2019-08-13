package com.hh.test.practice.annotation.test1;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/3 16:54
 */
public class UserValidate {

    @Validate(min = 2, max = 5)
    private String name;

    @Validate(isNotNull = false)
    private String age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }
}
