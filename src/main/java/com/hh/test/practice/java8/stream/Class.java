package com.hh.test.practice.java8.stream;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/7/30 11:09
 */
public class Class {

    private Integer id;

    private String grade;

    private String subject;

    public Class(Integer id, String grade, String subject){
        this.id = id;
        this.grade = grade;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
