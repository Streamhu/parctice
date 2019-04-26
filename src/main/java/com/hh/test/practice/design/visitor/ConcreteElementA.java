package com.hh.test.practice.design.visitor;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/22 8:44
 */
public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "具体元素A的操作";
    }

}
