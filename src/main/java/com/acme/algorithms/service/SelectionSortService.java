package com.acme.algorithms.service;

import com.acme.algorithms.resource.request.CarSortRequest;
import com.acme.algorithms.resource.response.CarSortResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectionSortService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SelectionSortService.class);

    @Autowired
    private SortService sortService;

    public CarSortResponse sort(CarSortRequest request) {
        LOGGER.info("m=sort request: {}", request);
        final var cars = request.getCars();
        final var size = cars.length;
        for (int current = 0; current < size - 1; current++) {
            int lowestPricePosition = sortService.getLowestPricePosition(cars, current, size);
            sortService.swipe(cars, current, lowestPricePosition);
        }
        final var response = new CarSortResponse().setCars(cars);
        LOGGER.info("m=sort response: {}", response);
        return response;
    }
}
