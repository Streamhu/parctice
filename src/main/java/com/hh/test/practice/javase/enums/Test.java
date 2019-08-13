package com.hh.test.practice.javase.enums;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/4 15:20
 */
public class Test {

    public static void main(String[] args) {
        EnumTest test = EnumTest.TUE;

        System.out.println("test = " + test);

        switch (test.compareTo(EnumTest.MON)){
            case -1:
                System.out.println("TUE 在 MON 之前");
                break;
            case 1:
                System.out.println("TUE 在 MON 之后");
                break;
            default:
                System.out.println("TUE 与 MON 在同一位置");
                break;
        }

        System.out.println("getDeclaringClass(): " + test.getDeclaringClass().getName());

        System.out.println("name():" + test.name());
        System.out.println("toString():" + test.toString());

        System.out.println("ordinal():" + test.ordinal());

        System.out.println("heart=" + test.getHeart());

        EnumTest.testEnum();
    }
}
