package com.hh.test.practice.java8;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/1/31 11:15
 */
public class DefaultMethodTest {

    public static void main(String[] args) {
        DCar car = new DCar();
        car.print();
    }
}

interface Vehicle{

    default void print(){
        System.out.println("我是一辆车");
    }

    static void bolwHorn(){
        System.out.println("按喇叭");
    }
}

interface FourWheeler{

    default  void print(){
        System.out.println("我是一辆四轮车");
    }
}

class DCar implements Vehicle, FourWheeler{
    @Override
    public void print(){
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.bolwHorn();
        System.out.println("我是一辆汽车");
    }
}

