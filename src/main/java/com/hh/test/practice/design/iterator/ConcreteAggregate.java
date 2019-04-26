package com.hh.test.practice.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/20 8:32
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Interator getIterator() {
        return new ConcreteInterator(list);
    }
}
