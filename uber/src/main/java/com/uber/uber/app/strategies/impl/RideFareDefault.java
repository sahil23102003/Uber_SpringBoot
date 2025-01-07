package com.uber.uber.app.strategies.impl;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.entities.RideRequest;
import com.uber.uber.app.services.DistanceService;
import com.uber.uber.app.strategies.CalculateFareStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareDefault implements CalculateFareStrategy {
    private final DistanceService distanceService;
    @Override

    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropLocation());
        return distance*RIDE_FARE_MULT;
    }
}
