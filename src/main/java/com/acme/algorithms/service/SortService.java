package com.acme.algorithms.service;

import com.acme.algorithms.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SortService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SortService.class);

    public int getLowestPricePosition(Car[] cars, int start, int end) {
        int lowestPricePosition = start;
        for (int current = start; current < end; current++) {
            if (cars[current].getPrice() < cars[lowestPricePosition].getPrice()) {
                lowestPricePosition = current;
            }
        }
        LOGGER.info("m=getLowestPricePosition cars:{} start:{} end:{} lowestPricePosition:{}", cars, start, end, cars[lowestPricePosition]);
        return lowestPricePosition;
    }

    public void swipe(final Car[] cars, int firstPosition, int secondPosition) {
        Car firstCar = cars[firstPosition];
        Car secondCar = cars[secondPosition];
        cars[secondPosition] = firstCar;
        cars[firstPosition] = secondCar;
    }
}
