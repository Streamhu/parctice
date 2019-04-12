package com.hh.test.practice.design.prototype;

import java.util.Scanner;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 11:10
 */
public class Square implements Shape {

    @Override
    public Object clone() {
        Square square = null;
        try{
            square = (Square)super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败!");
        }
        return square;
    }

    @Override
    public void countArea()
    {
        int a=0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.println("该正方形的面积="+a*a+"\n");
    }
}
