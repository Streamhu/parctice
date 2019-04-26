package com.hh.test.practice.design.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/22 8:56
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> i = list.iterator();
        while(i.hasNext()){
            i.next().accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }

}
