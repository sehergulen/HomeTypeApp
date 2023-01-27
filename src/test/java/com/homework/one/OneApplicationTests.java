package com.homework.one;

import com.homework.one.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class OneApplicationTests {

    @Autowired
    HomeService homeService;

    @Test
    void test_calculateTotalPricesOfHomes() {
        log.info("calculateTotalPricesOfHomes:{}", homeService.calculateTotalPricesOfHomes());
    }

    @Test
    void test_calculateAverageSquareMeterOfHomes() {
        log.info("calculateAverageSquareMeterOfHomes:{}", homeService.calculateAverageSquareMeterOfHomes());
    }

}
