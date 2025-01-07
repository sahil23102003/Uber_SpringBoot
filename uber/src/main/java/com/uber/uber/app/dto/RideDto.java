package com.uber.uber.app.dto;

import com.uber.uber.app.entities.Driver;
import com.uber.uber.app.entities.Rider;
import com.uber.uber.app.entities.enums.PaymentMethod;
import com.uber.uber.app.entities.enums.RideRequestMethod;
import com.uber.uber.app.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideRequestMethod rideRequestMethod;
    private RideStatus rideStatus;

    private String otp;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
