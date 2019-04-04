package com.hh.test.practice.enums;

public enum EnumTest {

    MON(1, "星期一", "不开心"), TUE(2, "星期二", "煎熬"), WED(3, "星期三", "有点希望了");

    int index;

    String name;

    String heart;

    EnumTest(int index, String name, String heart){
        this.index = index;
        this.name = name;
        this.heart = heart;
    }

    public static void testEnum(){
        System.out.println("我是一个测试的自定义方法");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }
}
