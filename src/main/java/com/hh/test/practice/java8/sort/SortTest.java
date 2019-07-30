package com.hh.test.practice.java8.sort;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/30 16:49
 */
public class SortTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("jack",17,10));
        users.add(new User("jack",18,10));
        users.add( new User("jack",19,11));
        users.add(new User("apple",25,15));
        users.add( new User("tommy",23,8));
        users.add(new User("jessica",15,13));

        // 传统方式排序
        // traditionCompareByName(users);

        // java8写法
        testJava8(users);

    }


    public static void testJava8(List<User> users){

        // 排序形式1
        users.sort((o1,o2) -> o1.getAge() - o2.getAge());
        users.forEach((item) -> System.out.println(item));

        // 形式2，亦可反向排序
        users.sort(Comparator.comparing(User::getAge).reversed());
        users.forEach((item) -> System.out.println("方法2 " + item));

        // 多条件排序(降序排列可以用 lambda也可以用reversed)
        users.sort(Comparator.comparing(User::getName).thenComparing(User::getAge, (o1, o2) -> o2 - o1).thenComparing(User::getScore).reversed());
        users.forEach((item) -> System.out.println("多条件排序 " + item));

    }

    public static void traditionCompareByName(List<User> users){
        // Comparator方法，传一个比较器
        Collections.sort(users, new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        // Comparable方法，需要对象实现Comparable
        Collections.sort(users);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
