package com.acme.algorithms.service;

import com.acme.algorithms.model.Car;
import com.acme.algorithms.resource.request.CarSortRequest;
import com.acme.algorithms.resource.response.CarSortResponse;
import com.acme.algorithms.service.core.SortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MergeSortService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MergeSortService.class);

    @Autowired
    private SortService sortService;

    public CarSortResponse sort(CarSortRequest request) {
        LOGGER.info("m=sort request: {}", request);
        final var start = 0;
        final var cars = request.getCars();
        mergeSort(cars, start, cars.length);
        final var response = new CarSortResponse()
                .setCars(cars);
        LOGGER.info("m=sort response: {}", response);
        return response;
    }

    public void mergeSort(Car[] cars, int start, int end) {
        LOGGER.info("m=mergeSort cars:{} start:{}, end:{} ", cars, start, end);
        final var length = end - start;
        if (length > 1) {
            int half = (start + end) / 2;
            mergeSort(cars, start, half);
            mergeSort(cars, half, end);
            merge(cars, start, half, end);
        }
    }

    private void merge(Car[] cars, int start, int split, int end) {
        LOGGER.info("m=mergeSort cars:{} start:{} split:{} end:{} ", cars, split, start, end);
        Car[] carsMerged = new Car[end - start];
        int current = 0;
        int currentLeft = start;
        int currentRight = split;
        while (currentLeft < split && currentRight < end) {
            Car carLeft = cars[currentLeft];
            Car carRight = cars[currentRight];
            if (carLeft.getPrice() < carRight.getPrice()) {
                carsMerged[current] = carLeft;
                currentLeft++;
            } else {
                carsMerged[current] = carRight;
                currentRight++;
            }
            current++;
        }

        while (currentLeft < split) {
            carsMerged[current++] = cars[currentLeft++];
        }

        while (currentRight < end) {
            carsMerged[current++] = cars[currentRight++];
        }

        for (int count = 0; count < current ; count++) {
            cars[start + count] = carsMerged[count];
        }

    }
}



