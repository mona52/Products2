package ru.netology.domain;

import java.util.Objects;

public class Book extends Product {
    private String author;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }

    public static class NotFoundException extends RuntimeException {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public NotFoundException(int id) {
            this.id = id;
        }

        public NotFoundException(String message, int id) {
            super(message);
            this.id = id;
        }

        public NotFoundException(String message, Throwable cause, int id) {
            super(message, cause);
            this.id = id;
        }

        public NotFoundException(Throwable cause, int id) {
            super(cause);
            this.id = id;
        }

        public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int id) {
            super(message, cause, enableSuppression, writableStackTrace);
            this.id = id;
        }

    }
}

