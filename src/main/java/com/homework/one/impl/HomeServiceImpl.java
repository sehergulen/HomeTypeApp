package com.homework.one.impl;

import com.homework.one.model.Home;
import com.homework.one.model.HomeType;
import com.homework.one.service.HomeDataService;
import com.homework.one.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeDataService homeDataService;

    @Override
    public long calculateTotalPricesOfHomes() {
        return calculateTotalPriceOfHomeType(HomeType.HOME);
    }

    @Override
    public long calculateTotalPricesOfVillas() {
        return calculateTotalPriceOfHomeType(HomeType.VILLA);
    }

    @Override
    public long calculateTotalPricesOfSummerHouse() {
        return calculateTotalPriceOfHomeType(HomeType.SUMMERHOUSE);
    }

    @Override
    public long calculateTotalPricesOfAll() {
        return calculateTotalPriceOfHomeType(null);
    }

    @Override
    public float calculateAverageSquareMeterOfHomes() {
        return calculateAverageSquareMeter(HomeType.HOME);
    }

    @Override
    public float calculateAverageSquareMeterOfVillas() {
        return calculateAverageSquareMeter(HomeType.VILLA);
    }

    @Override
    public float calculateAverageSquareMeterOfSummerHouse() {
        return calculateAverageSquareMeter(HomeType.SUMMERHOUSE);
    }

    @Override
    public float calculateAverageSquareMeterOfAll() {
        return calculateAverageSquareMeter(null);
    }

    @Override
    public List<Home> filterByNumberOfRoomsAndNumberOfLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        List<Home> homeList = homeDataService.getHomeList();
        List<Home> filteredHomeList = new ArrayList<>();
        for (Home home : homeList) {
            if (home.getNumberOfRooms() == numberOfRooms && home.getNumberOfLivingRoom() == numberOfLivingRooms) {
                filteredHomeList.add(home);
            }
        }
        return filteredHomeList;
    }

    private long calculateTotalPriceOfHomeType(HomeType homeType) {
        List<Home> homeList;
        if (homeType == null) {
            homeList = homeDataService.getHomeList();
        } else {
            homeList = homeDataService.getHomeListWihHomeType(homeType);
        }
        long totalPrice = 0;
        for (Home home : homeList) {
            totalPrice += home.getPrice();
        }
        return totalPrice;
    }

    private float calculateAverageSquareMeter(HomeType homeType) {
        List<Home> homeList;
        if (homeType == null) {
            homeList = homeDataService.getHomeList();
        } else {
            homeList = homeDataService.getHomeListWihHomeType(homeType);
        }
        int totalSquareMeter = 0;
        for (Home home : homeList) {
            totalSquareMeter += home.getSquareMeter();
        }
        return totalSquareMeter/homeList.size();
    }

}
