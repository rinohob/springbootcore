package com.School.GovernmentSchools.natinalSchool;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;


@Primary
@Component
public class DelhiPublicSchool {

    private String branch;
    private int students;
    private List<String> Staff;

    public DelhiPublicSchool(String branch, int students, List<String> staff) {
        this.branch = branch;
        this.students = students;
        Staff = staff;
    }

    public DelhiPublicSchool() {
        System.out.println("Delhi public School is created ");
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public List<String> getStaff() {
        return Staff;
    }

    public void setStaff(List<String> staff) {
        Staff = staff;
    }
}
