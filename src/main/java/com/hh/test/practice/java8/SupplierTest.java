package com.hh.test.practice.java8;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/1/31 10:16
 */

public interface SupplierTest<T> {
    T get();
}

class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final SupplierTest<Car> supplierTest) {
        return supplierTest.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}