package com.practice.bookapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.bookapp.entity.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {
    public Book findById(int id);
}
