package com.apollo84.astonHW2.tools;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer pageNumber;
    private Integer year;

    public Book(String title, String author, Integer pageNumber, Integer year) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        return  Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(pageNumber, book.pageNumber) &&
                Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() { return Objects.hash(title, author, pageNumber, year); }

    @Override
    public String toString() { return year.toString(); }

    public Integer getYear() { return year; }

    public Integer getPageNumber() { return pageNumber; }
}
