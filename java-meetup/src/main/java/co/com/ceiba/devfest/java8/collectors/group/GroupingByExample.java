package co.com.ceiba.devfest.java8.collectors.group;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Luis on 3/12/16.
 */
public class GroupingByExample {

    public static void main(String ... args) {
        List<Student> students = DataBase.readTxt();

        Map<Integer, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getGradYear));

        System.out.println(map);
    }
}
