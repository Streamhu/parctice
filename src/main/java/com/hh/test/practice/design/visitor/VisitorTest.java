package com.hh.test.practice.design.visitor;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/22 9:01
 */
public class VisitorTest {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());
        Visitor visitorA = new ConcreteVisitorA();
        structure.accept(visitorA);

        System.out.println("------------------------");

        Visitor visitorB = new ConcreteVisitorB();

        structure.accept(visitorB);


    }

}
