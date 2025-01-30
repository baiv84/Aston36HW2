package com.apollo84.astonHW2.tools;

import java.util.List;

final public class DataPrepareUtil {
    private DataPrepareUtil() {}

    public static List<Student> generateStudentList() {
        Student student1 = new Student("Вася Пупкин",
                List.of(
                        new Book("Война и мир", "Лев Толстой", 344,1890),
                        new Book("Евгений  Онегин", "А.С. Пушкин", 500,1850),
                        new Book("Тихий дон", "М.Шолохов", 2222,1935),
                        new Book("Бориска и сосиска", "И.Иванов", 123, 1998),
                        new Book("Горячий лед", "Г. Карпов", 457,1978)
                )
        );

        Student student2 = new Student("Боря Ляпкин",
                List.of(
                        new Book("Унесенные ветром", "М.Митчелл", 223,1890),
                        new Book("Тысяча и одна ночь", "пер. Шелгунова", 213,1233),
                        new Book("Собор Парижской богоматери", "В. Гюго", 123,1899),
                        new Book("Гордость и предубеждение", "Д. Остин", 500,1871),
                        new Book("Начала", "И. Ньютон", 1001,1763)
                )
        );

        Student student3 = new Student("Марк Овермарс",
                List.of(
                        new Book("Над пропастью во ржи", "Д. Селинджер", 234,1890),
                        new Book("Портрет Дориана Грея", "О. Уайлд", 431,1850),
                        new Book("Маленький принц", "С. Экзюпери", 667,1935),
                        new Book("Джейн Эйр", "Ш. Бронте", 998,1931),
                        new Book("Мартин Иден", "Д. Лондон", 997,2002)
                )
        );

        Student student4 = new Student("Марк Овермарс",
                List.of(
                        new Book("Сага о Форсайтах", "Д.Голдсуорси", 129,1890),
                        new Book("Отверженные", "В. Гюго", 229,1850),
                        new Book("100 лет одиночества", "Г.Маркес", 111,2000),
                        new Book("451 по Фаренгейту", "Р. Бредбери", 998,2001),
                        new Book("Мастер и Маргарита", "М. Булгаков", 200,2002)
                )
        );

        Student student5 = new Student("Леонид Карасев",
                List.of(
                        new Book("100 лет одиночества", "Г.Маркес", 111,2001),
                        new Book("Повелитель мух", "Уильям Голдинг", 997,2002),
                        new Book("На западном фронте без перемен", "Эрих Ремарк", 227,2004),
                        new Book("Поющие в терновнике", "Коллин Маккалоу", 889,2004),
                        new Book("Волшебник изумрудного города", "А. Волков", 218,1999)
                )
        );

        return List.of(student1, student2, student3, student4, student5);
    }
}
