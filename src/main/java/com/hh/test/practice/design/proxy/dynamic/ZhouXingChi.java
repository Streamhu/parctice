package com.hh.test.practice.design.proxy.dynamic;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 10:21
 */
public class ZhouXingChi implements Person{

    @Override
    public String sing(String name) {
        System.out.println("周星驰唱"+ name +"歌！！");
        return "歌唱完了，谢谢大家！";
    }

    @Override
    public String dance(String name) {
        System.out.println("星驰跳"+ name +"舞！！");
        return "舞跳完了，多谢各位观众！";
    }
}
