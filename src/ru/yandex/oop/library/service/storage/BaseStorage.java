package ru.yandex.oop.library.service.storage;

import ru.yandex.oop.library.model.HasId;

public abstract class BaseStorage<T extends HasId> {
    public void save(T item) {
        //...
    }

    public abstract T get(int id);

    //...
}
