package com.School.GovernmentSchools.natinalSchool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Component
public class Narayana1 {


    @Autowired
    private DelhiPublicSchool getDelhi1;

    public Narayana1() {
        System.out.println("the natinaol naryana object is ccreated");
    }

    public DelhiPublicSchool getDelhiPublicSchool() {
        return getDelhi1;
    }

    public static void test() {
        System.out.println("the hello world");
    }
}
