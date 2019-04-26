package com.hh.test.practice.design.visitor;

public interface Visitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);

}
