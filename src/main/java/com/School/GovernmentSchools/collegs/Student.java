package com.School.GovernmentSchools.collegs;


import org.springframework.stereotype.Component;

@Component
public class Student implements  Studentsinerface{

    private String stuName="umesh";
    private String stuClass;
    private int stuId;

    public Student() {
        System.out.println("This is the Student bean");
    }

    public Student(String stuName, String stuClass, int stuId) {
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Override
    public String getStuName1() {
        return stuName;
    }
}
