package ru.yandex.oop.library.service.storage;

import ru.yandex.oop.library.model.Book;

public class BookStorage extends BaseStorage<Book> {
    @Override
    public void save(Book item) {
        // ...
    }

    @Override
    public Book get(int id) {
        // ..
        return null;
    }

}
