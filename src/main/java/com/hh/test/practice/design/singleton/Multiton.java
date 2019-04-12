package com.hh.test.practice.design.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 10:07
 */
public class Multiton {

    private static List<Multiton> multitonList = new ArrayList<>();

    private static int n = 10;

    private Integer number;

    private Multiton(int i){
        this.number = i;
    }

    static{
        for(int i = 0; i<n ; i++){
            multitonList.add(new Multiton(i));
        }
    }

    public static Multiton getRandomInstance(){
        int value = (int)(Math.random() * n);
        return multitonList.get(value);
    }

    public static void main(String[] args) {
        Multiton multiton = getRandomInstance();
        System.out.println("随机拿到的 number = " + multiton.getNumber());
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
