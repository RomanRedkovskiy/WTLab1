package org.example.lab1.task12_16.task12_15;

public class ProgrammerBook extends Book {
    private final String language;
    private final int level;

    public ProgrammerBook(String title, String author, int price, int edition,
                          String isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook other = (ProgrammerBook) obj;
        return language.equals(other.language) && level == other.level;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + super.hashCode();
        hash = 31 * hash + (language == null ? 0 : language.hashCode());
        hash = 31 * hash + level;
        return hash;
    }

    @Override
    public String toString() {
        return "Programmer book: " +
                "\nTitle:  " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nLanguage: " + language +
                "\nLevel: " + level +
                "\nprice: " + getPrice() +
                "\nedition: " + getEdition() +
                "\nisbn: " + getIsbn();
    }
}
