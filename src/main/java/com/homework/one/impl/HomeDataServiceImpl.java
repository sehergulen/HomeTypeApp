package com.homework.one.impl;

import com.homework.one.model.Home;
import com.homework.one.model.HomeType;
import com.homework.one.service.HomeDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HomeDataServiceImpl implements HomeDataService {
    private List<Home> homeList;

    @PostConstruct
    void init() {
        homeList = new ArrayList<>();
        addHome(HomeType.HOME,2500000,100,2,1);
        addHome(HomeType.HOME,3500000,135,3,1);
        addHome(HomeType.HOME,1000000,65,1,1);
        addHome(HomeType.VILLA,7000000,190,4,2);
        addHome(HomeType.VILLA,8000000,225,5,2);
        addHome(HomeType.VILLA,9000000,255,6,1);
        addHome(HomeType.SUMMERHOUSE,5000000,160,2,0);
        addHome(HomeType.SUMMERHOUSE,8000000,230,5,1);
        addHome(HomeType.SUMMERHOUSE,6500000,160,3,1);
    }

    @Override
    public void addHome(HomeType homeType, long price, int squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        Home home = new Home(homeType, price, squareMeter, numberOfRooms, numberOfLivingRooms);
        homeList.add(home);
        log.info("home added to list:{}", home);
    }

    @Override
    public List<Home> getHomeListWihHomeType(HomeType homeType) {
        List<Home> homeListWithHomeType = new ArrayList<>();
        for (Home home : homeList) {
            if (home.getHomeType().equals(homeType)) {
                homeListWithHomeType.add(home);
            }
        }
        return homeListWithHomeType;
    }

    @Override
    public List<Home> getHomeList() {
        return homeList;
    }
}
