package com.uber.uber.app.repository;

import com.uber.uber.app.entities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query("SELECT d.*, ST_Distance(d.current_location, :pickupLocation " +
            "FROM drivers AS d " +
            "where available = true AND ST_DWithin(d.current_location, :pickupLocation, 10000 " +
            "ORDER BY distance " +
            "LIMIT 10"
    )
    List<Driver> findMatchingDrivers(Point pickupLocation);
}
