package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <E> {
    public boolean theSameAs(E e);

    public boolean equals(Object o);
}
