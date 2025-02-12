package com.School.GovernmentSchools.Hotels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;


@Controller
public class ThreeStar implements Restaurents {


    private String address;

    private String item;

    private int cost;

    private int rooms;

    private Restaurents restaurents;

    @Qualifier("twoStar")
    @Autowired
    private Restaurents restaurents1;


    public ThreeStar() {
    }

    @Qualifier("fiveStar")
    @Autowired
    public void setRestaurents(Restaurents restaurents) {
        this.restaurents = restaurents;
    }

    @Value("${city.addres}")
    public void setAddress(String address) {
        this.address = address;
    }

    @Value("${city.item}")
    public void setItem(String item) {
        this.item = item;
    }

    @Value("${city.cost}")
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Value("${city.room}")
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getItem() {
        return item;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getRooms() {
        return rooms;
    }

    public Restaurents getRestaurents() {
        return restaurents;
    }

    public Restaurents getRestaurents1(){
        return  restaurents1;
    }

}
