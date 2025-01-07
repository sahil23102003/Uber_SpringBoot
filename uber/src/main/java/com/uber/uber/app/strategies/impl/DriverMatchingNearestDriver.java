package com.uber.uber.app.strategies.impl;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.entities.Driver;
import com.uber.uber.app.entities.RideRequest;
import com.uber.uber.app.repository.DriverRepository;
import com.uber.uber.app.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriver implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> matchDrivers(RideRequest rideRequest) {
        return driverRepository.findMatchingDrivers(rideRequest.getPickupLocation());
    }
}
