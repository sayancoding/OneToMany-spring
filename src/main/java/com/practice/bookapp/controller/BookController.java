package com.practice.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bookapp.dao.BookDao;
import com.practice.bookapp.entity.Book;

@RestController
public class BookController {
    
    @Autowired
    public BookDao bookDao;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return (List<Book>)bookDao.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable int id){
        return bookDao.findById(id);
    }
    
    @PostMapping("/book")
    public Book postBook(@RequestBody Book book) {
        return bookDao.save(book);
    }
}
