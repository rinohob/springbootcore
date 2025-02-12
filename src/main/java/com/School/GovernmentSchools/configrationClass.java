package com.School.GovernmentSchools;



import com.School.GovernmentSchools.collegs.Chaitanya;
import com.School.GovernmentSchools.collegs.Nri;
import com.School.GovernmentSchools.collegs.ParayanaClg;
import com.School.GovernmentSchools.collegs.Student;
import com.School.GovernmentSchools.natinalSchool.DelhiPublicSchool;
import com.School.GovernmentSchools.natinalSchool.Narayana1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;


@PropertySource(value = {"localrestuarent.properties","restaurent.properties"})
@Configuration
public class configrationClass {

    @Bean("narayana121")
    public Narayana1 getNarayan() {
        System.out.println("the naryana object is created Using the bean method");
        return new Narayana1();
    }

    @Bean
    public DelhiPublicSchool getDelhi() {
        DelhiPublicSchool delhiPublicSchool = new DelhiPublicSchool();
        delhiPublicSchool.setBranch("hyderbad");
        List<String> staff = List.of("teachingStaff", "nonTeaching Staff");
        delhiPublicSchool.setStaff(staff);
        delhiPublicSchool.setStudents(2000);
        return delhiPublicSchool;
    }


    @Bean
    public DelhiPublicSchool getDelhi2() {
        List<String> staff = List.of("teachingStaff", "nonTeaching Staff");
        return new DelhiPublicSchool("AP", 1500, staff);
    }


    @Bean("student1")
    public Student getStudent(){
        return  new Student();
    }
    @Bean("nri1")
    public Nri getNri(){
        return  new Nri();
    }

    @Bean("parayana1")
    public ParayanaClg getparyana(){
        return  new ParayanaClg();
    }
    @Bean("chaitanay1")
    public Chaitanya getChitanya(){
        return  new Chaitanya();
    }

}
