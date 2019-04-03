package com.hh.test.practice.java8;

import java.util.Arrays;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/3/29 11:11
 */
public class ComparatorTest {

    public static void main(String[] args) {

        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

        ComparatorTest test = new ComparatorTest();
        test.testComparable();
    }

    public void testComparable(){
        //定义一个学生数据库
        final int STUDENT_NUM = 4;
        Student[] allStudents = new Student[STUDENT_NUM];

        //初始化学生数据库
        allStudents[0] = new Student("00001","a");
        allStudents[1] = new Student("00003","b");
        allStudents[2] = new Student("00002","c");
        allStudents[3] = new Student("00004","d");
        for(int i=0;i<allStudents.length;i++){
            allStudents[i].setAge(i*10);
        }
        for(int i=0;i<allStudents.length;i++){
            allStudents[i].setScore(99 - i*1.5);
        }

        //按学号升序排序
        Arrays.sort(allStudents);

        //显示学生信息
        System.out.println("学号" + "\t姓名" + "\t年龄" + "\t成绩");
        for(int i=0;i<allStudents.length;i++){
            System.out.print(allStudents[i]);
        }
    }

    class Student implements Comparable<Student>{

        @Override
        public int compareTo(Student o) {
            return this.score.compareTo(o.getScore());//此种写法为升序，若改为arg0.ID.compareTo(this.ID)则为降序
        }

        private String ID;
        private String name;
        private int age;
        private Double score;

        //为Student定义两个构造方法
        public Student(String ID, String name) {
            this(ID,name,0,0d);
        }
        public Student(String ID, String name, int age, Double score){
            this.ID = ID;
            this.name = name;
            this.age = age;
            this.score = score;
        }

        //属性值访问与修改
        public String getID(){
            return ID;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public Double getScore(){
            return score;
        }

        public void setID(String newID){
            ID = newID;
        }
        public void setName(String newName){
            name = newName;
        }
        public void setAge(int newAge){
            if(newAge < 0)
                newAge = 0;
            age = newAge;
        }
        public void setScore(double newScore){
            if( (newScore < 0 )||(newScore > 100)){
                newScore = 0;
            }
            score = newScore;
        }

        //重写对象字符串表示方法
        @Override
        public String toString() {
            String info = new String();
            info = ID + '\t' + name + '\t' + age + '\t' + score + '\n';
            return info;
        }
    }
}
