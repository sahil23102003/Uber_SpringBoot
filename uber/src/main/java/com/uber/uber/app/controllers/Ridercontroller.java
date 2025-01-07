package com.uber.uber.app.controllers;

import com.uber.uber.app.dto.RideRequestDto;
import com.uber.uber.app.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class Ridercontroller {

    private final RiderService riderService;

    public Ridercontroller(RiderService riderService) {
        this.riderService = riderService;
    }


    @PostMapping
    public ResponseEntity<RideRequestDto> requestRide(@RequestBody RideRequestDto rideRequestDto){
        return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
    }

}
