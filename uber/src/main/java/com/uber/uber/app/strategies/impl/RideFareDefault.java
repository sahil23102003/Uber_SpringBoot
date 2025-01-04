package com.uber.uber.app.strategies.impl;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.strategies.CalculateFareStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareDefault implements CalculateFareStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
