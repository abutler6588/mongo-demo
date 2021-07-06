package com.springmongodemo.mongodemo.Repository;

import com.springmongodemo.mongodemo.model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends MongoRepository<Books,String> {
    @Query("{'author': ?0}")
    List<Books> findByAuthor(String author);
}
