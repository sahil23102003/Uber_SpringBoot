package com.uber.uber.app.services.impl;

import com.uber.uber.app.dto.DriverDto;
import com.uber.uber.app.dto.RideDto;
import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.dto.RiderDto;
import com.uber.uber.app.entities.Driver;
import com.uber.uber.app.entities.Ride;
import com.uber.uber.app.entities.RideRequest;
import com.uber.uber.app.entities.enums.RideRequestMethod;
import com.uber.uber.app.entities.enums.RideStatus;
import com.uber.uber.app.repository.RideRequestRepository;
import com.uber.uber.app.services.RideService;
import com.uber.uber.app.services.RiderService;
import com.uber.uber.app.strategies.CalculateFareStrategy;
import com.uber.uber.app.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final CalculateFareStrategy calculateFareStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestMethod(RideRequestMethod.PENDING);

        double fare = calculateFareStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest =  rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.matchDrivers(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
