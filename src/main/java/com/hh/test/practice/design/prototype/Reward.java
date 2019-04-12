package com.hh.test.practice.design.prototype;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 10:49
 */
public class Reward implements Cloneable {

    private String name;

    private String info;

    private String college;

    public Reward(String name, String info, String college){
        this.name=name;
        this.info=info;
        this.college=college;
        System.out.println("奖状创建成功！");
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void dispaly(){
        System.out.println(name + info + college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Reward object1 = new Reward("梦幻", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "NCU");
        object1.dispaly();
        Reward object2 = (Reward)object1.clone();
        object2.setName("西游");
        object2.dispaly();
    }
}
