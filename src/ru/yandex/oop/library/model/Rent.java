package ru.yandex.oop.library.model;

import java.time.LocalDate;

public class Rent implements HasId {
    User user;
    LibraryItem item;
    LocalDate returnDate;
    // опустили getter, setters

    @Override
    public int getId() {
        return 0;
    }
}
