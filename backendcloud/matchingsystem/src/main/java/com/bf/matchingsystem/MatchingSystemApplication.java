package com.bf.matchingsystem;

import com.bf.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args) {
        MatchingServiceImpl.matchingPool.start(); // starting the matching thread
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}
