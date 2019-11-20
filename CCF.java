package com.company;

import java.util.Comparator;

public class CCF<D extends Number> implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        if (book.getPrice()>t1.getPrice()){
            return 1;
        }
        else if (book.getPrice()<t1.getPrice()){
            return -1;
        }
        else {
            return 0;
        }
    }
}

