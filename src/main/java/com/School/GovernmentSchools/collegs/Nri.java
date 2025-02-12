package com.School.GovernmentSchools.collegs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Nri {
    private String clgBranch;
    private List<String> courses;
    private int clgCapacity;
    private Student student;

    public Nri() {
        System.out.println("this is the Nri Clg bean");
    }

    public Nri(String clgBranch, List<String> courses, int clgCapacity) {
        this.clgBranch = clgBranch;
        this.courses = courses;
        this.clgCapacity = clgCapacity;
    }

    public String getClgBranch() {
        return clgBranch;
    }

    public void setClgBranch(String clgBranch) {
        this.clgBranch = clgBranch;
    }

    public int getClgCapacity() {
        return clgCapacity;
    }

    public void setClgCapacity(int clgCapacity) {
        this.clgCapacity = clgCapacity;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Autowired
    public void setStudent(Student student){
        this.student=student;

    }
    public Student getStudent(){
        return  student;
    }
}
