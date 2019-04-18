package com.hh.test.practice.design.flyweight;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 18:07
 */
public class UnshareFlyweight {

    private String info;

    public UnshareFlyweight(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
