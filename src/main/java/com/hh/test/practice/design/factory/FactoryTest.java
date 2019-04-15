package com.hh.test.practice.design.factory;

import com.hh.test.practice.design.factory.simple.Operation;
import com.hh.test.practice.design.factory.simple.SimpleFactory;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 15:18
 */
public class FactoryTest {

    public static void main(String[] args) throws Exception {

        // 使用反射机制实例化工厂对象，因为字符串是可以通过变量改变的
        Factory addFactory = (Factory) Class.forName("com.hh.test.practice.design.factory.AddFactory").newInstance();
        Factory subFactory=(Factory) Class.forName("com.hh.test.practice.design.factory.SubFactory").newInstance();

        // 通过工厂对象创建相应的实例对象
        Operation add = addFactory.createOperation();
        Operation sub = subFactory.createOperation();

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
    }
}
