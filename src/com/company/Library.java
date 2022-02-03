package com.company;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> library = new ArrayList<>();

    public Library() {
        this.library = library;
        library.add(new Book("Forår", 2019, 123456));
        library.add(new Book("Efterår", 2020, 456123));
        library.add(new Book("Vinter", 2021, 789123));
    }

    public boolean doWeHaveBook(Book book) {
        boolean temp = false;
        for (Book b : library) {
            if(b.getISBN() == book.getISBN()){
                temp = true;
            }

        }
        return temp;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book("Sommer", 2022, 012376);
        Book book2 = new Book("Vinter", 2021, 789123);
        System.out.println(lib.doWeHaveBook(book1));
        System.out.println(lib.doWeHaveBook(book2));
        System.out.println(lib);


    }
}
