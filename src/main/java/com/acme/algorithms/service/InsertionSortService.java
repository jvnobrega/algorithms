package com.acme.algorithms.service;

import com.acme.algorithms.resource.request.CarSortRequest;
import com.acme.algorithms.resource.response.CarSortResponse;
import com.acme.algorithms.service.core.SortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertionSortService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InsertionSortService.class);

    @Autowired
    private SortService sortService;

    public CarSortResponse sort(CarSortRequest request) {
        LOGGER.info("m=sort request: {}", request);
        final var cars = request.getCars();
        final var size = cars.length;
        for (int current = 1; current < size; current++) {
            int check = current;
            LOGGER.info("Analysing car[" + check + "]: " + cars[check]);
            while (check > 0 && cars[check - 1].getPrice() > cars[check].getPrice()) {
                sortService.swap(cars, check, check - 1);
                check--;
            }
        }
        final var response = new CarSortResponse().setCars(cars);
        LOGGER.info("m=sort response: {}", response);
        return response;
    }
}
