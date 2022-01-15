package ru.yandex.oop.library.service;

import java.util.ArrayList;
import java.util.Collection;

import ru.yandex.oop.library.model.LibraryItem;
import ru.yandex.oop.library.model.Rent;
import ru.yandex.oop.library.model.User;

public class RentManager {

    public void rent(User user, LibraryItem item) {
        // ...
    }

    public Collection<Rent> getUserRents(User user) {
        // ..
        return new ArrayList<>();
    }

    public void returnItem(Rent rent) {
        // ...
    }
}
