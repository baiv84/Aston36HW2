package com.apollo84.astonHW2.tools;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Book> books;

    public Student(String name, List<Book> booksOnHands) {
        this.name = name;
        this.books = new ArrayList<>();
        booksOnHands.stream().forEach(this.books::add);
    }

    public List<Book> getBooks() {
        System.out.println(this);
        return books;
    }

    @Override
    public String toString() { return "Студент: " + name; }
}




//
//List<Student> listOfLists = DataPrepareUtil.generateStudentList();
//List<Integer> lb =
//        listOfLists.stream()
//                .map(elem -> elem.getBooks())
//                .flatMap(List::stream)
//                .sorted(new Comparator<Book>() {
//                    @Override
//                    public int compare(Book o1, Book o2) {
//                        return o1.getPageNumber().compareTo(o2.getPageNumber());
//                    }
//                })
//                .filter(book -> book.getYear() > 2000)
//                .distinct()
//                .limit(3)
//                .map(book -> book.getYear())
//                .toList();
//
//        System.out.println(lb);