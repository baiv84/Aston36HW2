package com.apollo84.astonHW2.tools;

import java.util.*;


public class MainApp {
    private static final int YEAR = 2000;

    public static void main(String[] args) {
        List<Student> students = DataPrepareUtil.generateStudentList();

        students.stream()

                // итерируем по коллекции студентов - печатаем имя студента и ложим в стрим список книг студента
                .map(Student::getBooks)

                // получаем общий список книг всех студентов
                .flatMap(List::stream)

                // сортируем общий список книг по количеству страниц
                .sorted(Comparator.comparing(Book::getPageNumber))

                // оствляем только уникальные книги
                .distinct()

                // фильтруем список книг по заданному году
                .filter(book -> book.getYear() > YEAR)

                // ограничиваем стрим на 3 элементах
                .limit(3)

                // Получить из книг годы выпуска
                .map(Book::getYear)

                // Получаем Optional у книги
                // Если есть книги удовлетворяющие условию по году издания - печатаем год издания книги
                // Иначе печатаем сообщение об отсутствии книг по заданному критерию
                .findFirst().ifPresentOrElse(System.out::println,
                        () -> System.out.println("Нет книг, выпущенных после " + YEAR +  " года."));

    }
}
