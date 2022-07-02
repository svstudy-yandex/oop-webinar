package ru.yandex.oop;

import ru.yandex.oop.rent.model.Bicycle;
import ru.yandex.oop.rent.model.Car;
import ru.yandex.oop.rent.model.Moto;
import ru.yandex.oop.rent.model.Vehicle;
import ru.yandex.oop.rent.service.RentManager;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        RentManager manager = new RentManager();
        Car car = new Car(1);
        manager.rent(car);

        Vehicle vehicle = new Car(2);
        System.out.println(vehicle.getId());
        Vehicle vehicle2 = new Moto(1);
        Vehicle vehicle3 = new Bicycle(1);
    }
}
