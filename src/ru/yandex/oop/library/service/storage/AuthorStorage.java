package ru.yandex.oop.library.service.storage;

import ru.yandex.oop.library.model.Author;

public class AuthorStorage extends BaseStorage<Author> {
    @Override
    public void save(Author item) {
        super.save(item);
        // ...
    }

    @Override
    public Author get(int id) {
        // ...
        return null;
    }
}
