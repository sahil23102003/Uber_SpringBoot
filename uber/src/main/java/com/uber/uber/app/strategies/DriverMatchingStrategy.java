package com.uber.uber.app.strategies;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.entities.Driver;
import com.uber.uber.app.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

   List<Driver> matchDrivers(RideRequest rideRequest);
}
