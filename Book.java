package com.company;

import java.util.Comparator;


public class Book {
    private String BookName;
    private String Author;
    private long isbn;
    private double price;

    Book(String BookName, String Author, long isbn, double price) {
        this.Author = Author;
        this.BookName = BookName;
        this.isbn = isbn;
        this.price = price;
    }

    Book() {
super();
    }

    public String getBookName() {
        return BookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return BookName+Author+isbn+price;
    }






}

