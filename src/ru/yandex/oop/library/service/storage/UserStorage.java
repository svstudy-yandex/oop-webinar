package ru.yandex.oop.library.service.storage;

import ru.yandex.oop.library.model.User;

public class UserStorage extends BaseStorage<User> {
    @Override
    public void save(User item) {
        // ..
    }

    @Override
    public User get(int id) {
        // ...
        return null;
    }
}
