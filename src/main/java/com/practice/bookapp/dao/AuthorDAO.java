package com.practice.bookapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.bookapp.entity.Author;

@Repository
public interface AuthorDAO extends CrudRepository<Author,Integer> {
    public Author findById(int id);
}
