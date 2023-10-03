package org.example.lab1.task12_16.task12_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void cloneWhenUninitializedObjectShouldReturnUninitializedCloneObject() {
        //given
        Book book = new Book();
        //when
        Book clone = book.clone();
        //then
        assertEquals(book.getTitle(), clone.getTitle());
        assertEquals(book.getAuthor(), clone.getAuthor());
        assertEquals(book.getPrice(), clone.getPrice());
        assertEquals(book.getEdition(), clone.getEdition());
        assertEquals(book.getIsbn(), clone.getIsbn());
    }

    @Test
    void cloneWhenObjectHasOneNullFieldShouldReturnCloneObjectWithOneNullField() {
        //given
        Book book = new Book("Clean Code", "Robert Martin", 30, 1, null);
        //when
        Book clone = book.clone();
        //then
        assertEquals(book.getTitle(), clone.getTitle());
        assertEquals(book.getAuthor(), clone.getAuthor());
        assertEquals(book.getPrice(), clone.getPrice());
        assertEquals(book.getEdition(), clone.getEdition());
        assertEquals(book.getIsbn(), clone.getIsbn());
    }

    @Test
    void sortWhenBookListShouldReturnSortedByIsbnBookList() {
        //given
        Book firstBook = new Book("Harry Potter and The Philosopher's Stone",
                "J.K.Rowling", 17, 1, "9780747573609");
        Book secondBook = new Book("Harry Potter and The Goblet Of Fire",
                "J.K.Rowling", 21, 1, "0439139597");
        Book thirdBook = new Book("Java Puzzlers",
                "Joshua Bloch", 40, 6, "032133678");
        Book fourthBook = new Book("Clean Code",
                "Robert Martin", 30, 2, "9780132350884");

        List<Book> books = new ArrayList<>(List.of(firstBook, secondBook, thirdBook, fourthBook));
        //when
        Collections.sort(books);
        List<Book> expected = new ArrayList<>(List.of(thirdBook, secondBook, fourthBook, firstBook));
        //then
        Assertions.assertEquals(books, expected);
    }
}