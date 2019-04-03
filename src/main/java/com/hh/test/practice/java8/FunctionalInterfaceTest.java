package com.hh.test.practice.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
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

        // 测试java8四大函数式接口
        testFour();
    }

    public static void testFour(){
        // 函数式接口Function
        Function<Integer, Integer> func = p -> p*10;
        Integer result = func.apply(10);
        System.out.println("result = " + result);
        // 函数式接口Consumer
        Consumer<String> consumer = p -> System.out.println("p = " + p);
        consumer.accept("消费者你好啊");
        // 函数式接口Supplier
        Supplier<Integer> supplier = () -> 100;
        Integer supplierResult = supplier.get();
        System.out.println("supplierResult = " + supplierResult);
        // 函数式接口
        Predicate<Integer> predicate = p -> p % 2 == 0;
        Boolean predicateResult = predicate.test(100);
        System.out.println("predicateResult = " + predicateResult);

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
