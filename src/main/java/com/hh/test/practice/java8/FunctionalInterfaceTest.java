package com.hh.test.practice.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        // 测试java8四大函数式接口
        testFour();
    }

    public static void testFour(){

        // 原有写法
        Function<Integer, String> functionOrigin = new Function() {
            @Override
            public Object apply(Object o) {
                return o.toString();
            }
        };
        String result1 = functionOrigin.apply(3);
        // 函数式接口Function
        Function<Integer, String> function = a -> a.toString();
        // 对比结果
        System.out.println("java7测试 = " + result1);
        System.out.println("lambda测试function = " + function.apply(3));

        // 函数式接口Consumer
        Consumer<Integer> consumer = a -> System.out.println("consumer测试 = " + a);
        consumer.accept(12);

        // 函数式接口Supplier
        Supplier<String> supplier = () -> "hello world" ;
        String result2 = supplier.get();
        System.out.println("supplier测试 " + result2);

        // 函数式接口Predicate断言
        Predicate<Integer> predicate = a -> a > 10;
        Boolean result3 = predicate.test(3);
        System.out.println("predicate测试 = " + result3);


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
