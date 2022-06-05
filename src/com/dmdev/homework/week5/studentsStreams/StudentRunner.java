package com.dmdev.homework.week5.studentsStreams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Comparator;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * 1. Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * 2. Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * 3. Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StudentRunner {

    private static final int MIN_VALUABLE_GRADELIST = 3;

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Вася", "Васильев", Year.FOURTH, List.of(4, 3, 4, 5, 3, 2, 5)),
                new Student("Петр", "Петров", Year.THIRD, List.of(5, 5, 5)),
                new Student("Катя", "Комарова", Year.FIRST, List.of(5, 3)),
                new Student("Катя", "Ломарова", Year.FIRST, List.of(5, 3)),
                new Student("Семён", "Семёнов", Year.FIFTH, List.of(4, 4, 5, 5, 3, 5, 5)),
                new Student("Васисуалий", "Петрович", Year.FIFTH, List.of(5, 3, 4, 5)),
                new Student("Коля", "Иванов", Year.SECOND, List.of(4, 5, 5, 5, 5, 5, 5)),
                new Student("Женя", "Иванов", Year.SECOND, List.of(4, 3, 4, 5, 3, 4, 4, 4))
        );
        System.out.println(getAverageGradeByYear(students));
        System.out.println(getStudentBasicInfo(students));
    }

    public static Map<Year, Double> getAverageGradeByYear(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrades().size() > MIN_VALUABLE_GRADELIST)
                .collect(
                        Collectors.groupingBy(Student::getYear, //сгруппировать по курсу
                                TreeMap::new,
                                Collectors.mapping(Student::getGrades, //переход к списку оценок
                                        Collectors.flatMapping(Collection::stream, //переход к оценкам
                                                Collectors.averagingDouble(mark -> mark))))); //вычисление среднего значения
    }

    public static Map<Year, List<StudentBasic>> getStudentBasicInfo(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSurname)) //сортировка по имени и фамилии
                .collect(Collectors.groupingBy(Student::getYear, //группировка по курсу
                        TreeMap::new,
                        Collectors.mapping(student -> new StudentBasic(student.getName(), student.getSurname()), //создание новых объектов
                                Collectors.toList()))); //формирование из них списка
    }
/*
    Для третьего задания идеи были такие:
    1. Использовать наработки первых двух заданий
    2. Создать новый объект и в его конструктор передать два потока - для формирования списка и для вычисления средней оценки.
}*/
}
