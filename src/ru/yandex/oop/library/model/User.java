package ru.yandex.oop.library.model;

import java.time.LocalDate;

public class User implements HasId {
    int id;
    String fullName;
    LocalDate dateOfBirth;
    // опустили getter, setters

    @Override
    public int getId() {
        return 0;
    }
}
