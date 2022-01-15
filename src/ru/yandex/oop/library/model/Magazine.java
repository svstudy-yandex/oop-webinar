package ru.yandex.oop.library.model;

public class Magazine extends LibraryItem {
    int number;
    int year; // можно вынести в базовый класс
    int month; // можно объединить с годом в одно поле
    // опустили getter, setters
}
