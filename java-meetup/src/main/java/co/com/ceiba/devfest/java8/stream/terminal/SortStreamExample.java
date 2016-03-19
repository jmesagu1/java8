package co.com.ceiba.devfest.java8.stream.terminal;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Luis on 3/19/16.
 */
public class SortStreamExample {

    public static void main(String ... args) {
        List<Student> students = DataBase.readTxt();

        Stream<Student> studentsStream = students.stream();

        if (args[0].equals("ASC")) {
            studentsStream = sortAscending(studentsStream);
        } else {
            studentsStream = sortDescending(studentsStream);
        }

        studentsStream.limit(10)
                .forEach(System.out::println);
    }

    public static Stream<Student> sortAscending(Stream<Student> stream) {
        return stream.sorted(Comparator.comparing(Student::getFullName));
    }

    public static Stream<Student> sortDescending(Stream<Student> stream) {
        return stream.sorted(Comparator.comparing(Student::getFullName).reversed());
    }

}
