package com.hh.test.practice.design.flyweight;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 18:09
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key){
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnshareFlyweight outState) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息是:"+ outState.getInfo());
    }
}
