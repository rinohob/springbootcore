package com.School.GovernmentSchools.Hotels;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TwoStar implements Restaurents {

    @Value("${local.address}")
    private String address;

    @Value("${local.item}")
    private String item;

    @Value("${local.cost}")
    private int cost;

    @Value("${local.rooms}")
    private int rooms;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

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
}
