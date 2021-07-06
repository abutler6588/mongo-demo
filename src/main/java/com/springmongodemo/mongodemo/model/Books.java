package com.springmongodemo.mongodemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Books {

    @Id
    private String userId;
    private String title;
    private String author;
    private int numOfPages;
    private double price;

    public Books() {

    }

    public Books(String title, String author, int numOfPages, double price) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numOfPages=" + numOfPages +
                ", price=" + price +
                '}';
    }
}
