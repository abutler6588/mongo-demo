package com.springmongodemo.mongodemo.controller;

import com.springmongodemo.mongodemo.Repository.BookRepositoryTemplate;
import com.springmongodemo.mongodemo.Repository.BooksRepository;
import com.springmongodemo.mongodemo.model.Books;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {

    private final BooksRepository booksRepository;

    public BookController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }


    //Getting All Books

//    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @GetMapping("/books")
    public List<Books> getAllUsers() {
        System.out.println("logging all books");
        return booksRepository.findAll();
    }


}
