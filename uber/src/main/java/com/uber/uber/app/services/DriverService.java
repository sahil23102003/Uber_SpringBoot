package com.uber.uber.app.services;

import com.uber.uber.app.dto.DriverDto;
import com.uber.uber.app.dto.RideDto;
import com.uber.uber.app.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
