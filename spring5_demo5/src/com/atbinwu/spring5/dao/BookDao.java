package com.atbinwu.spring5.dao;

import com.atbinwu.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);

    public int selectCount();

    Book findBookInfo(int id);

    List<Book> findAll();

    void batchAddBook(List<Object[]> list);
}

