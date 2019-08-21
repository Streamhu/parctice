package com.hh.test.practice.javase.bit;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/8/20 17:38
 */
public class MainTest {

    public static void main(String[] args) {

        // 按位于（&）
        // test1();
        // 按位或( | )
        // test2();
        // 异或( ^ ) 和取反（~）
         test3();
        // 左移和右移运算符（<< 、>>）
        // test4();
    }

    private static void test4(){
        // 往左挪X位，右边补0（乘以2的x次方）, 高位移出（舍弃），低位的空位补零
        int i = 35 << 2; // 140
        int j = 50 << 4; // 200
        System.out.println("i = " + i + "/ j = " + j);
        // 往右移X位（除以2的x次方）, 低位移出（舍弃），高位的空位补零。
        int a = 35 >> 2; // 8
        int b = 50 >> 4; // 3
        System.out.println("a = " + a + "/ b = " + b);
    }

    private static void test3(){
        // 运算规则为1^0 = 1 , 1^1 = 0 , 0^1 = 1 , 0^0 = 0
        int i = 35 ^ 50; // 17
        int j = 120 ^ 4; // 124
        System.out.println("i = " + i + "/ j = " + j);
        // 取反就是1为0,0为1
        int a = ~5;
        System.out.println("a = " + a);
    }

    private static void test2(){
        // 运算规则(一个为真即为真)1|0 = 1 , 1|1 = 1 , 0|0 = 0 , 0|1 = 1
        int i = 35 | 50; // 51
        int j = 120| 4; // 124
        System.out.println("i = " + i + "/ j = " + j);
    }

    private static void test1(){
        // 按位于（&）, 运算两边的条件会先换算成二进制，然后再对比计算
        // 运算规则即(两个为真才为真)1&1=1 , 1&0=0 , 0&1=0 , 0&0=0
        int i = 35&50; // 34
        int j = 120&4; // 0
        System.out.println("i = " + i + "/ j = " + j);
    }
}
