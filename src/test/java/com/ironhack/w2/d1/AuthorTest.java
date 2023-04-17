package com.ironhack.w2.d1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    public static List<Book> books;
    public static Author author;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll antes que nada");

        books = new ArrayList<>();
        books.add(new Book("The Raven", 50));
        books.add(new Book("The Black Cat", 60));
    }

    @BeforeEach
    public void setUp() {
        System.out.println("beforeEach antes de cada test");

        author = new Author("Edgar", "Allan Poe", books);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("afterEach después de cada test");
    }

    @Test
    void getBookListSize() {
        int bookListSize = author.getBookListSize();
        System.out.println("Book list size: " + bookListSize);

        assertEquals(2, bookListSize);
    }

    @Test
    void getFullName() {
        String fullName = author.getFullName();
        System.out.println("Full name: " + fullName);

        assertEquals("Edgar Allan Poe", fullName);
    }

    @Test
    void booklistToArray() {
        Book[] bookArray = {
                new Book("The Raven", 50),
                new Book("The Black Cat", 60)
        };

//        assertArrayEquals(bookArray, author.booklistToArray());
        System.out.println(Arrays.toString(bookArray));
        assertEquals(Arrays.toString(bookArray), Arrays.toString(author.booklistToArray()));
    }
}