package ru.yandex.oop.rent.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import ru.yandex.oop.rent.model.Car;
import ru.yandex.oop.rent.model.Vehicle;

public class RentManager {

    private final Map<Integer, Vehicle> vehiclesById = new HashMap<>();

    public void rent(Vehicle vehicle) {
        double pricePerHour = vehicle.getPricePerHour();
        vehiclesById.put(vehicle.getId(), vehicle);

        /*
        if (vehicle.getClass() == Car.class) {

        }
        if (vehicle instanceof Car) {

        }
        
        ///...


        Vehicle v =  vehiclesById.get(1);
         */
    }
}
