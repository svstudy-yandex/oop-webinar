package ru.yandex.oop.library.service.storage;

import ru.yandex.oop.library.model.Rent;

public class RentStorage extends BaseStorage<Rent> {
    @Override
    public void save(Rent item) {
        super.save(item);
        //...
    }

    @Override
    public Rent get(int id) {
        //...
        return null;
    }
}
