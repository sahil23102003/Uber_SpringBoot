package com.uber.uber.app.services.impl;

import com.uber.uber.app.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public Double calculateDistance(Point src, Point des) {
        return 0.0;
    }
}
