package com.spring.dao;

import com.spring.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<Book,Integer> {

}
