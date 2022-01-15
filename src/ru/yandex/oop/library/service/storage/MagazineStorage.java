package ru.yandex.oop.library.service.storage;

import ru.yandex.oop.library.model.Magazine;
import ru.yandex.oop.library.service.storage.BaseStorage;

public class MagazineStorage extends BaseStorage<Magazine> {

    @Override
    public void save(Magazine item) {
        // ...
    }

    @Override
    public Magazine get(int id) {
        // ...
        return null;
    }
}
