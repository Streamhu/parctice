package com.hh.test.practice.java8;

import java.util.*;
import java.util.function.Predicate;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/1/31 10:51
 */
public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("输出所有数据:");
        // 传递参数 n
        eval(list, n -> true);

        System.out.println("输出所有偶数:");
        eval(list, n -> n % 2 == 0 );

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n -> n > 3 );
    }

    /**
     * Predicate是java8里面的一个函数式接口 , n 如果存在则 test 方法返回 true
     */
    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for(Integer n: list){
            // predicate是（n -> n % 2 == 0）
            if(predicate.test(n)){
                System.out.println(n);
            }
        }
    }

}
