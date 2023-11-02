package fr.efrei.domain;

public class Book {
    private String isbn;
    private String title;
    private Author author;

    private Book() {
    }
    private Book(Book.Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.author = builder.author;
    }



    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
    public static class Builder {
        private String isbn;
        private String title;
        private Author author;

        public Book.Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Book.Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public Book.Builder setAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Book build() { return new Book(this); }
    }
}
