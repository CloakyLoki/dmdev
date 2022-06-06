package com.dmdev.homework.week5.studentsStreams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Comparator;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

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

        System.out.println("1. Ключ - курс, значение: Средняя оценка студентов курса, количество оценок у которых больше 3-х");
        for (Map.Entry<Year, Double> entry : getAverageGradeByYear(students).entrySet()) {
            System.out.println("Курс: " + entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("2. Ключ - курс, значение: Список студентов данного курса, но только с полями Имя и Фамилия.");
        for (Map.Entry<Year, List<StudentBasic>> entry : getStudentBasicInfo(students).entrySet()) {
            System.out.println("Курс: " + entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("3. Ключ - курс, значение: Объект с двумя полями:\n" +
                " * - Отсортированный список студентов с пункта 2\n" +
                " * - Средняя оценка этих студентов");
        for (Map.Entry<Year, Statistic> entry : getStudentBasicAverage(students).entrySet()) {
            System.out.println("Курс: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<Year, Double> getAverageGradeByYear(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrades().size() > MIN_VALUABLE_GRADELIST)
                .collect(
                        groupingBy(Student::getYear, //сгруппировать по курсу
                                TreeMap::new,
                                Collectors.mapping(Student::getGrades, //переход к списку оценок
                                        Collectors.flatMapping(Collection::stream, //переход к оценкам
                                                Collectors.averagingDouble(mark -> mark))))); //вычисление среднего значения
    }

    public static Map<Year, List<StudentBasic>> getStudentBasicInfo(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSurname)) //сортировка по имени и фамилии
                .collect(groupingBy(Student::getYear, //группировка по курсу
                        TreeMap::new,
                        Collectors.mapping(student -> new StudentBasic(student.getName(), student.getSurname()), //создание новых объектов
                                toList()))); //формирование из них списка
    }

    public static Map<Year, Statistic> getStudentBasicAverage(List<Student> students) {
        return students.stream()
                .collect(Collectors.collectingAndThen(
                        groupingBy(Student::getYear, toList()),
                        resultMap -> {
                            Map<Year, Statistic> statMap = new TreeMap<>(); //result
                            resultMap.forEach((year, studentList) -> {
                                List<StudentBasic> studentsBasic = studentList.stream()
                                        .map(student -> new StudentBasic(student.getName(), student.getSurname()))
                                        .collect(toList());
                                double averageGrade = studentList.stream()
                                        .flatMap(student -> student.getGrades().stream())
                                        .mapToDouble(grade -> grade)
                                        .average()
                                        .orElse(0);
                                Statistic statistic = new Statistic(studentsBasic, averageGrade);
                                statMap.put(year, statistic);
                            });
                            return statMap;
                        }));
    }
}
