package ru.yandex.oop.rent.service;

import ru.yandex.oop.rent.model.Vehicle;

public abstract class BaseRentManager<T extends Vehicle> {
    public abstract void rent(T vehicle);

    private void sendMoney(double sum) {
        //...
    }
}
