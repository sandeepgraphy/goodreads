package com.example.goodreads;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
public interface BookRepository {
    ArrayList<Book> getBooks();

    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(int bookId, Book book);
    void deleteBook(int bookId);

}
