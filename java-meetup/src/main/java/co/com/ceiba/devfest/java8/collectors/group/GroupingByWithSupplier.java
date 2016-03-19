package co.com.ceiba.devfest.java8.collectors.group;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Luis on 3/12/16.
 */
public class GroupingByWithSupplier {

    public static void main(String ... args) {
        List<Student> students = DataBase.readTxt();

        Map<Integer, Long> map = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGradYear,
                        () -> new TreeMap<>((i, j) -> j - i),
                        Collectors.counting()
                ));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
