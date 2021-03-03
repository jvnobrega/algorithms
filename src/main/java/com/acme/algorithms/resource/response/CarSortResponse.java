package com.acme.algorithms.resource.response;

import com.acme.algorithms.model.Car;

import java.util.Arrays;

public class CarSortResponse {

    private Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public CarSortResponse setCars(Car[] cars) {
        this.cars = cars;
        return this;
    }

    @Override
    public String toString() {
        return "SelectionSortRequest{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}
