package com.hh.test.practice.design.prototype;

import java.util.Scanner;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 11:07
 */
public class Circle implements Shape{

    @Override
    public Object clone() {
        Circle circle = null;
        try{
            circle = (Circle)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("拷贝圆失败!");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r=0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        System.out.println("该圆的面积="+3.1415*r*r+"\n");
    }
}
