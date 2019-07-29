package com.hh.test.practice.java8;

import java.util.*;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/1/31 10:16
 */
public class MethodReferencesTest {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        // 构造器引入
        Car car1 = Car.create( Car::new );
        cars.add(car1);
        cars.add(Car.create( Car::new ));
        // 静态方法引用
        cars.forEach(Car::collide);
        cars.forEach(car -> Car.collide(car));
        // 特定类的任意对象的方法引用
        cars.forEach(Car::repair);
        cars.forEach(car -> car.repair());
        // 特定对象的方法引用
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );
        cars.forEach(car -> police.follow(car));

    }


}
