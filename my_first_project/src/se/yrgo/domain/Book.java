package se.yrgo.domain;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book name: " + name + ", Number of pages: " + numberOfPages;
    }
}

