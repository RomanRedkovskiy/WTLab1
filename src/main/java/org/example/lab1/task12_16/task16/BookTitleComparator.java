package org.example.lab1.task12_16.task16;

import org.example.lab1.task12_16.task12_15.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return Comparator.comparing(Book::getTitle).compare(firstBook, secondBook);
    }
}
