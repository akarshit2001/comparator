# comparator
package com.company;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
       
        Scanner c = new Scanner(System.in);
        ArrayList<Book> s = new ArrayList<>();
        Book b;
        for (int i = 0; i < 3; i++) {
            String BookName = c.nextLine();
            String Author = c.nextLine();
            int isbn = c.nextInt();
            double price = c.nextDouble();
            
            c.nextLine();
            Book n = new Book(BookName, Author, isbn, price);
            s.add(n);
        }
CCf<String,Integer> nu=new CCf<>();//create separate class for collection;
        CCF<Double>vb=new CCF<>();

Collections.sort(s,vb);
                System.out.println("printing student list");
 //for each loop;
 for (Book g : s) {
            System.out.println(g);
        }
        Collections.sort(s,nu);
        for (Book g : s) {
            System.out.println(g);
        }

    }
}
            




