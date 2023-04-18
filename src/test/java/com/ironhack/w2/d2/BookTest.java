package com.ironhack.w2.d2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getBook() {
        Book expectedBook = new Book(1234, "Harry Potter", "J.K. Rowling", 1995);
        assertEquals(expectedBook, Book.getBook());
    }
}