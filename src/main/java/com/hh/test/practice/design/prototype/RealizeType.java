package com.hh.test.practice.design.prototype;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 10:23
 */
public class RealizeType implements Cloneable{

    public RealizeType(){
        System.out.println("具体原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType object1 = new RealizeType();
        RealizeType object2 = (RealizeType)object1.clone();
        System.out.println("object1 = object2 ? " + (object1 == object2));

    }
}
