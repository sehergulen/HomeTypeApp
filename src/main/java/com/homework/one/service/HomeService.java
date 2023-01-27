package com.homework.one.service;

import com.homework.one.model.Home;
import com.homework.one.model.HomeType;

import java.util.List;

public interface HomeService {
    long calculateTotalPricesOfHomes();

    long calculateTotalPricesOfVillas();

    long calculateTotalPricesOfSummerHouse();

    long calculateTotalPricesOfAll();

    float calculateAverageSquareMeterOfHomes();

    float calculateAverageSquareMeterOfVillas();

    float calculateAverageSquareMeterOfSummerHouse();

    float calculateAverageSquareMeterOfAll();

    List<Home> filterByNumberOfRoomsAndNumberOfLivingRooms(int numberOfRooms, int numberOfLivingRooms);





}
