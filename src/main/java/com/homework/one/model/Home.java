package com.homework.one.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Home {
    private HomeType homeType;
    private long price;
    private int squareMeter;
    private int numberOfRooms;
    private int numberOfLivingRoom;


    @Override
    public String toString() {
        return "Home{" +
                "homeType=" + homeType +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRoom=" + numberOfLivingRoom +
                '}';
    }
}
