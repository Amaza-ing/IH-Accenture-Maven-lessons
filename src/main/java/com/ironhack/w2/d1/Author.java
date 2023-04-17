package com.ironhack.w2.d1;

import java.util.List;

public class Author {
    private String name;
    private String lastname;
    private List<Book> publishedBooks;

    public Author(String name, String lastname, List<Book> publishedBooks) {
        this.name = name;
        this.lastname = lastname;
        this.publishedBooks = publishedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", publishedBooks=" + publishedBooks +
                '}';
    }
}
