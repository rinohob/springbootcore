package com.School.GovernmentSchools.collegs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Chaitanya {

    private String clgBranch;
    private List<String> courses;
    private int clgCapacity;


    @Qualifier("student")
    @Autowired
    private Studentsinerface studentsinerface;

    public Chaitanya() {
        System.out.println("This is the object from the chaitanya bean");
    }

    public Chaitanya(String clgBranch, List<String> courses, int clgCapacity) {
        this.clgBranch = clgBranch;
        this.courses = courses;
        this.clgCapacity = clgCapacity;
    }

    public Studentsinerface getStudentsinerface() {
        return studentsinerface;
    }

    public String getClgBranch() {
        return clgBranch;
    }

    public void setClgBranch(String clgBranch) {
        this.clgBranch = clgBranch;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getClgCapacity() {
        return clgCapacity;
    }

    public void setClgCapacity(int clgCapacity) {
        this.clgCapacity = clgCapacity;
    }
}
