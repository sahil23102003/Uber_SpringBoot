package com.uber.uber.app.services;

import com.uber.uber.app.dto.DriverDto;
import com.uber.uber.app.dto.RideDto;
import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateRider(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
