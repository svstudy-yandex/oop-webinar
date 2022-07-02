package ru.yandex.oop.rent.model;

public class Car extends Vehicle implements Motorized {
    public Car(int id) {
        super(id);
    }
    String manufactor;
    String vin;

}
