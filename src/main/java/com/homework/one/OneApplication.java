package com.homework.one;

import com.homework.one.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j

public class OneApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}
	@Autowired
	HomeService homeService;
	@Override
	public void run(String... args) throws Exception {

		log.info("{}",homeService.calculateTotalPricesOfHomes());

	}
}
