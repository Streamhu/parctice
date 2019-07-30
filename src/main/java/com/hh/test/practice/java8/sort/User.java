package com.hh.test.practice.java8.sort;


import java.util.Comparator;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/30 16:50
 */
public class User implements Comparable<User>{

    private String name;

    private Integer age;

    private Integer score;

    public User(String name, Integer age, Integer score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(User o) {
        return o.getAge().compareTo(this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
