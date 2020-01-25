package com.nazarii.tkachuk.bookmanager.service;

import com.nazarii.tkachuk.bookmanager.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

}
