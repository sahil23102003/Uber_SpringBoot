package com.uber.uber.app.strategies;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.entities.RideRequest;
import lombok.Data;


public interface CalculateFareStrategy {

    double RIDE_FARE_MULT = 10;
    double calculateFare(RideRequest rideRequest);
}
