package com.bf.matchingsystem.service;

public interface MatchingService {
    String addPlayer(Integer userId, Integer rating);
    String removePlayer(Integer userId);
}
