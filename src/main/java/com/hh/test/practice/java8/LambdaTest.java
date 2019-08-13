package com.hh.test.practice.java8;

import com.hh.test.practice.javase.generic.Generator;

/**
 * lambda表达式入门
 *
 * @author huhui
 * @since 2019/1/31 9:29
 */
public class LambdaTest {

    public static void main(String[] args) {
        LambdaTest test = new LambdaTest();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("5 + 10 =" + test.operate(5, 10, addition));

        // 不用类型声明
        MathOperation subtraction = (a, b) ->  a - b;
        System.out.println("10 - 5 =" + test.operate(10, 5, subtraction));

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        System.out.println("5 * 10 =" + test.operate(5, 10, multiplication));

        // 没有大括号的返回语句
        MathOperation division = (a, b) -> a / b;
        System.out.println("10 / 5 =" + test.operate(10, 5, division));

        // 不用括号
        GreetingService greetingService1 = message -> System.out.println("hello " + message);
        greetingService1.sayMessage("one");

        // 使用括号
        GreetingService greetingService2 = (message) -> System.out.println("hello " + message);
        greetingService2.sayMessage("two");



    }

    interface MathOperation{
        int operation(int a, int b);

    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation math){
        return math.operation(a, b);
    }

}
