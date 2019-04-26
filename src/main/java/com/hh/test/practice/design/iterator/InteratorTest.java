package com.hh.test.practice.design.iterator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/20 8:43
 */
public class InteratorTest {

    public static void main(String[] args) {
        Aggregate aggreagate = new ConcreteAggregate();
        aggreagate.add("南昌大学");
        aggreagate.add("中山大学");
        aggreagate.add("深圳大学");

        Interator interator = aggreagate.getIterator();
        while(interator.hasNext()){
            Object obj = interator.next();
            System.out.println("遍历的是 = " + obj.toString());
        }

        Object obj = interator.first();
        System.out.println("第一个元素是" + obj.toString());
    }
}
