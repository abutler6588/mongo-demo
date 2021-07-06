package com.springmongodemo.mongodemo.Repository;

import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

//@Repository
public class BookRepositoryTemplate {

//    @Autowired
//    private MongoOperations mongoOperations;
//
//    public List<Book> customFindAll() {
//        return mongoOperations.findAll(Book.class);
//    }

//    public Book customCreate(Book book) {
//        return mongoTemplate.save(book);
//    }

//    public MongoQuery customFindOne(String title) {
//        Query query = new Query().addCriteria(Criteria.where("title").is(title));
//        return new MongoQuery(userId, mongoTemplate.findOne(query, Book.class));
//    }

//    public UpdateResult customUpdate(String userId, Book book) {
//        //create update
//        Update update = new Update();
//        //create query
//        Query query = new Query().addCriteria(Criteria.where("userId").is(userId));
//        //find existing user
//        Book eUser = mongoTemplate.findOne(query, Book.class);
////        //get existing user settings to compare
////        Map<String, String> eSettings = Book.getBookSettings();
////        //get incoming data
////        String name = book.getTitle();
////        Map<String, String> settings = book.getBookSettings();
//        //check for no name
//        if (book != null) {
//            update.set("name", book);
//        }
//        //check for no settings
//        if (!settings.isEmpty()) {
//            //combine settings
//            eSettings.putAll(settings);
//            update.set("userSettings", eSettings);
//        }
//        return mongoTemplate.upsert(query, update, Book.class);
//    }

//    public DeleteResult customDeleteById(String userId) {
//        Query query = new Query().addCriteria(Criteria.where("userId").is(userId));
//        return mongoTemplate.remove(query, Book.class);
//    }
}
