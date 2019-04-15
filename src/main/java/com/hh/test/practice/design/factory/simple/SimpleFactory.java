package com.hh.test.practice.design.factory.simple;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/15 11:13
 */
public class SimpleFactory {

    // 简单工厂，根据字符串创建响应对象
    public static Operation createOperation(String name){
        Operation  operation = null;
        switch (name){
            case "+" :
                operation = new Add();
                break;
            case "-" :
                operation = new Sub();
                break;
            case "*" :
                operation = new Mul();
                break;
            case "/" :
                operation = new Div();
                break;
        }
        return operation;
    }

    public static void main(String[] args) throws Exception{

        Operation add = SimpleFactory.createOperation("+");
        Operation sub = SimpleFactory.createOperation("-");
        Operation mul = SimpleFactory.createOperation("*");
        Operation div = SimpleFactory.createOperation("/");

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
        System.out.println(mul.getResult(1, 1));
        System.out.println(div.getResult(1, 1));

    }
}
