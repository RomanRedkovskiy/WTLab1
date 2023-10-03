package org.example.lab1.task12_16.task16;

import org.example.lab1.task12_16.task12_15.Book;

import java.util.Comparator;

public class BookTitleThenAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor)
                .compare(book1,book2);
    }
}