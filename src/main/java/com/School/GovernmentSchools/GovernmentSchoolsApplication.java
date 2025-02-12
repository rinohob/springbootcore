package com.School.GovernmentSchools;

import com.School.GovernmentSchools.Hotels.FiveStar;
import com.School.GovernmentSchools.Hotels.ThreeStar;
import com.School.GovernmentSchools.Hotels.TwoStar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(scanBasePackages = "com.*")
public class GovernmentSchoolsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GovernmentSchoolsApplication.class, args);
        ThreeStar threeStar = (ThreeStar) context.getBean("threeStar");
        FiveStar fiveStar = (FiveStar) context.getBean("fiveStar");
        TwoStar twoStar = (TwoStar) context.getBean("twoStar");


        System.out.println(threeStar.getCost());
        System.out.println(threeStar.getAddress());
        System.out.println(threeStar.getRooms());
        System.out.println(threeStar.getItem());
        System.out.println("********************************************************");
        System.out.println(threeStar.getRestaurents().getClass());
        System.out.println(threeStar.getRestaurents().getCost());
        System.out.println(threeStar.getRestaurents().getAddress());
        System.out.println(threeStar.getRestaurents().getRooms());
        System.out.println(threeStar.getRestaurents().getItem());
        System.out.println("********************************************************");
        System.out.println(threeStar.getRestaurents1().getClass());
        System.out.println(threeStar.getRestaurents1().getCost());
        System.out.println(threeStar.getRestaurents1().getAddress());
        System.out.println(threeStar.getRestaurents1().getRooms());
        System.out.println(threeStar.getRestaurents1().getItem());




    }

}
