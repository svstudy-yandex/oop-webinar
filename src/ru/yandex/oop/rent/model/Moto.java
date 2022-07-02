package ru.yandex.oop.rent.model;

public class Moto extends Vehicle implements Motorized {
    String manufactor;
    String vin;

    public Moto(int id) {
        super(id);
    }
}
