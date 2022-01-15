package ru.yandex.oop.library.model;

public abstract class LibraryItem implements HasId {
    int id;
    String registerNumber;
    String name;
    // опустили getter, setters

    @Override
    public int getId() {
        return id;
    }
}
