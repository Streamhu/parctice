package com.hh.test.practice.design.flyweight;

import java.util.HashMap;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 18:12
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight != null){
            System.out.println("具体享元"+ key +"已经存在，被成功获取！");
        }else{
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
