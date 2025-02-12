package com.School.GovernmentSchools.Hotels;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FiveStar implements Restaurents {

    private String address;

    private String item;

    private int cost;

    private int rooms;


    public FiveStar(@Value("${restaurent.room}") int rooms, @Value("${restaurent.code}") int cost,  @Value("Hyderad biryani") String item,   @Value("Hyderad biryani")String address) {
        this.rooms = rooms;
        this.cost = cost;
        this.item = item;
        this.address = address;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setAddress(String address) {
        this.address = address;
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
