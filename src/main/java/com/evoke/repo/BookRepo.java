package com.evoke.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long>{

}
