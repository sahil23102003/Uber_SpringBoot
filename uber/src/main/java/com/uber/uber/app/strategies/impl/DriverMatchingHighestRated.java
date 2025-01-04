package com.uber.uber.app.strategies.impl;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.entities.Driver;
import com.uber.uber.app.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverMatchingHighestRated implements DriverMatchingStrategy {
    @Override
    public List<Driver> matchDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
