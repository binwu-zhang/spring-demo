package com.atbinwu.spring5.service;

import com.atbinwu.spring5.dao.BookDao;
import com.atbinwu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加
    public void addBook(Book book){
        bookDao.add(book);
    }

    public int findCount(){
        return  bookDao.selectCount();
    }

    public Book findOne(int id){
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAll(){
        return bookDao.findAll();
    }

    public void batchAddBook(List<Object[]> list){
        bookDao.batchAddBook(list);
    }
}
