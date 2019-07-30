package com.hh.test.practice.java8.stream;

import java.net.InterfaceAddress;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/29 15:14
 */
public class StreanTest1 {

    public static void main(String[] args) {
        // 测试中间操作
        testNormal();
        // 测试reduce - 终端操作（它提供一个起始值（种子），然后依照运算规则（BinaryOperator），和前面 Stream 的第一个、第二个、第 n 个元素组合）
        testReduce();
        // match测试 - 终端操作
        matchTest();

    }
    private static void matchTest(){
        List<Person> persons = new ArrayList();
        persons.add(new Person(1, "name1" + 1, 10));
        persons.add(new Person(2, "name2" + 2, 21));
        persons.add(new Person(3, "name3" + 3, 34));
        persons.add(new Person(4, "name4" + 4, 6));
        persons.add(new Person(5, "name5" + 5, 55));
        boolean isAllAdult = persons.stream().allMatch(p -> p.getAge() > 18);
        System.out.println("All are adult? " + isAllAdult);
        boolean isThereAnyChild = persons.stream().anyMatch(p -> p.getAge() < 12);
        System.out.println("Any child? " + isThereAnyChild);
        boolean isNone = persons.stream().noneMatch(p -> p.getAge() > 100);
        System.out.println("是否都没有" + isNone);
    }

    private static void testReduce(){
        // 字符串拼接(两种方式)
        String concat = Stream.of("A","B","C","D").reduce("", (s1,s2) -> s1.concat(s2));
        concat = Stream.of("A","B","C","D").reduce("ss", String::concat);
        System.out.println("concat = " + concat);

        // 求最小值
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        System.out.println("minValue = " + minValue);

        // 求和(两种方式)
        Integer sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println("sumValue = " + sumValue);

        // iterate
        Stream.iterate(0, n -> n + 3).limit(10).forEach(x -> System.out.println(x + " "));

    }

    private static void testNormal(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        // filter使用 （Predicate）
        List<String> filter = strings.stream().filter(s -> s != null && s != "").collect(Collectors.toList());
        filter.forEach(s -> System.out.println(s));

        // map的使用(Function， distinct + limit + skip使用)
        List<Integer> intList = Arrays.asList(0,1,1,2,3,4,5,6,7);
        List<Integer> mapList = intList.stream().map(a -> a * a ).distinct().limit(4).skip(1).collect(Collectors.toList());
        mapList.forEach(s -> System.out.println(s));

        // peek的使用(Consumer，一半调试用，或者做一些外部处理，会返回原来的新的Stream)
        List<Integer> intList2 = Arrays.asList(0,1,1,2,3,4,5,6,7);
        List<Integer> mapList2 = intList2.stream().peek(a -> System.out.println("peek->" + a)).collect(Collectors.toList());

        // sorted的使用(升序)
        List<Integer> integerList = Arrays.asList(3,2,1,4,5,6);
        List<Integer> sortedList = integerList.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(s -> System.out.println(s));

        // flatMap使用
        String[] words = {"hello", "world"};
        List<String[]> a = Arrays.stream(words).map(word -> word.split("")).distinct().collect(Collectors.toList());
        a.forEach(s -> System.out.println(s));

        // 对比上面
        List<String> b = Arrays.stream(words).map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        b.forEach(s -> System.out.println(s));

        // 单独拿出来测试(把几个Stream合成一个Stream,对流扁平化处理)
        Integer[] a1 = {1,2,3};
        Integer[] a2 = {6,5,4};
        Integer[] a3 = {8,8,8};
        Stream<Integer[]> s1 = Stream.of(a1,a2,a3);
        List<Integer> aa = s1.flatMap(Arrays::stream).sorted().collect(Collectors.toList());
        aa.forEach(s -> System.out.println(s));
    }
}
