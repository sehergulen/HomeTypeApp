package com.homework.one.service;

import com.homework.one.model.Home;
import com.homework.one.model.HomeType;

import java.util.List;

public interface HomeDataService {

    void addHome(HomeType homeType, long price, int squareMeter, int numberOfRooms, int numberOfLivingRooms);
    List<Home> getHomeListWihHomeType(HomeType homeType);
    List<Home> getHomeList();


}
