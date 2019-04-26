package com.hh.test.practice.design.visitor;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/22 8:49
 */
public class ConcreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->"+ element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->"+ element.operationB());
    }
}
