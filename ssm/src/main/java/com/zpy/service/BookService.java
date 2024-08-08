package com.zpy.service;

import com.zpy.pojo.Book;

import java.util.List;

public interface BookService  {
    List<Book> list();

    int addBook(Book book);

    int deleteBook(int id);

    Book getBookById(int id);

    int updateBook(Book book);
}
