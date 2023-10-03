package org.example.lab1.task12_16.task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.lab1.task12_16.task12_15.Book;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {

    private final BookTitleComparator titleComparator = new BookTitleComparator();
    private final BookTitleThenAuthorComparator titleThenAuthorComparator = new BookTitleThenAuthorComparator();
    private final BookAuthorThenTitleComparator authorThenTitleComparator = new BookAuthorThenTitleComparator();
    private final BookAuthorThenTitleThenPriceComparator authorThenTitleThenPriceComparator
            = new BookAuthorThenTitleThenPriceComparator();

    @Test
    void sortByTitleComparatorWhenSortedBookListReturnSortedListByTitle() {
        //given
        Book firstBook = new Book("Harry Potter and The Philosopher's Stone",
                "J.K.Rowling", 17, 1, "9780747573609");
        Book secondBook = new Book("Harry Potter and The Goblet Of Fire",
                "J.K.Rowling", 21, 1, "0439139597");
        Book thirdBook = new Book("Java Puzzlers",
                "Joshua Bloch", 40, 6, "032133678");
        Book fourthBook = new Book("Clean Code",
                "Robert Martin", 30, 2, "9780132350884");

        List<Book> books = new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fourthBook);

        //when
        books.sort(titleComparator); //comparator as a parameter
        List<Book> expected = new ArrayList<>();
        expected.add(fourthBook);
        expected.add(secondBook);
        expected.add(firstBook);
        expected.add(thirdBook);

        //then
        Assertions.assertEquals(expected, books);
    }

    @Test
    void sortByAuthorThenTitleComparatorWhenSortedBookListReturnSortedListByTitleThenComparator() {
        //given
        Book firstBook = new Book("Harry Potter and The Philosopher's Stone",
                "J.K.Rowling", 17, 1, "9780747573609");
        Book secondBook = new Book("Harry Potter and The Goblet Of Fire",
                "J.K.Rowling", 21, 1, "0439139597");
        Book thirdBook = new Book("Harry Potter and The Chamber Of Secrets",
                "J.K.Rowling", 40, 6, "032133678");
        Book fourthBook = new Book("Clean Code",
                "Robert Martin", 30, 2, "9780132350884");

        List<Book> books = new ArrayList<>();

        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fourthBook);

        //when
        books.sort(authorThenTitleComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(thirdBook);
        expected.add(secondBook);
        expected.add(firstBook);
        expected.add(fourthBook);

        //then
        Assertions.assertEquals(expected, books);
    }

    @Test
    void sortByAuthorThenTitleThenPriceComparatorWhenSortedBookListReturnSortedListByAuthorThenTitleThenPrice() {
        Book firstBook = new Book("Harry Potter and The Philosopher's Stone",
                "J.K.Rowling", 17, 1, "9780747573609");
        Book secondBook = new Book("Harry Potter and The Chamber Of Secrets",
                "J.K.Rowling", 21, 1, "0439139597");
        Book thirdBook = new Book("Harry Potter and The Chamber Of Secrets",
                "J.K.Rowling", 40, 2, "032133678");
        Book fourthBook = new Book("Clean Code",
                "Robert Martin", 30, 2, "9780132350884");

        List<Book> books = new ArrayList<>();
        books.add(secondBook);
        books.add(thirdBook);
        books.add(firstBook);
        books.add(fourthBook);

        books.sort(authorThenTitleThenPriceComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(secondBook);
        expected.add(thirdBook);
        expected.add(firstBook);
        expected.add(fourthBook);

        Assertions.assertEquals(expected, books);
    }

    @Test
    void sortByTitleThenAuthorComparatorWhenSortedBookListReturnSortedListByTitleThenAuthor() {
        Book firstBook = new Book("Harry Potter and The Philosopher's Stone",
                "J.K.Rowling", 17, 1, "9780747573609");
        Book secondBook = new Book("The Chamber Of Secrets",
                "J.K.Rowling", 21, 1, "0439139597");
        Book thirdBook = new Book("The Chamber Of Secrets",
                "Other Guy Who Wrote This Book :)", 40, 2, "032133678");
        Book fourthBook = new Book("Clean Code",
                "Robert Martin", 30, 2, "9780132350884");

        List<Book> books = new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fourthBook);

        books.sort(titleThenAuthorComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(fourthBook);
        expected.add(firstBook);
        expected.add(secondBook);
        expected.add(thirdBook);

        Assertions.assertEquals(expected, books);
    }
}
