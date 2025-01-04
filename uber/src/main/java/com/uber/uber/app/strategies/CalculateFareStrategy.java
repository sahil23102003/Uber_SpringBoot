package com.uber.uber.app.strategies;

import com.uber.uber.app.dto.RideRequestDto;

public interface CalculateFareStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
