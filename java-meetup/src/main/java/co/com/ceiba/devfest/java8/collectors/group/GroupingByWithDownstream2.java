package co.com.ceiba.devfest.java8.collectors.group;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Luis on 3/12/16.
 */
public class GroupingByWithDownstream2 {

    public static void main(String ... args) {
        List<Student> students = DataBase.readTxt();

        Map<Integer, DoubleSummaryStatistics> map = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGradYear,
                        Collectors.summarizingDouble(Student::getScore)));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
