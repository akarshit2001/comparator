
package com.company;

import java.util.Comparator;

public class CCf<S, I extends Number> implements Comparator <Book> {


    @Override
    public int compare(Book book, Book t1) {
        return book.getBookName().compareTo(t1.getBookName());
    }
}

