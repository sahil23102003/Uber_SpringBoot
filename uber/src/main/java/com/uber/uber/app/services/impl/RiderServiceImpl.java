package com.uber.uber.app.services.impl;

import com.uber.uber.app.dto.DriverDto;
import com.uber.uber.app.dto.RideDto;
import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.dto.RiderDto;
import com.uber.uber.app.entities.Driver;
import com.uber.uber.app.entities.Ride;
import com.uber.uber.app.entities.RideRequest;
import com.uber.uber.app.entities.enums.RideStatus;
import com.uber.uber.app.services.RideService;
import com.uber.uber.app.services.RiderService;
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

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);

        return null;
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
