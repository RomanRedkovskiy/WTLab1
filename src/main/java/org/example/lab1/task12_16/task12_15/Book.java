package org.example.lab1.task12_16.task12_15;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int edition;
    private String isbn;

    public Book(String title, String author, int price, int edition, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) && price == book.price &&
                edition == book.edition && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : author.hashCode());
        hash = 31 * hash + price;
        hash = 31 * hash + edition;
        hash = 31 * hash + (isbn == null ? 0 : isbn.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Book: " +
                "\nTitle:  " + title +
                "\nAuthor: " + author +
                "\nprice: " + price +
                "\nedition: " + edition +
                "\nisbn: " + isbn;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
