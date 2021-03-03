package com.acme.algorithms.resource.request;

import com.acme.algorithms.model.Car;

import java.util.Arrays;

public class CarSortRequest {

    private Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public CarSortRequest setCars(Car[] cars) {
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
