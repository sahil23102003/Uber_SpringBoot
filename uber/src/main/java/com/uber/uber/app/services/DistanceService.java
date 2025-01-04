package com.uber.uber.app.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    Double calculateDistance(Point src, Point des);
}
