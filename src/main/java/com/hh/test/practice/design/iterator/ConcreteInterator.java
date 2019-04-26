package com.hh.test.practice.design.iterator;

import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/20 8:35
 */
public class ConcreteInterator implements Interator{

    private List<Object> list = null;

    private int index = 0;

    public ConcreteInterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        int index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = list.get(index++);
        }
        return obj;
    }
}
