package com.nazarii.tkachuk.bookmanager.dao;

import com.nazarii.tkachuk.bookmanager.model.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void deleteBook(int id);

    public Book getBookByID(int id);

    public List<Book> listBooks();
}
