package com.company;

public class Book {

    private String title;
    private int yearOfRelease;
    private int ISBN;

    public Book(String title, int yearOfRelease, int ISBN) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", ISBN=" + ISBN +
                '}';
    }


}
