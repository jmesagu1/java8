package co.com.ceiba.devfest.java8.collectors.map;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jhon on 13/03/16.
 */
public class MapHighest {

    public static void main (String ... args){
        List<Student> students = DataBase.readTxt();

        Map<Integer, Student> groupByScore =
                students.stream()
                        .collect(Collectors.toMap(
                                Student :: getGradYear,
                                Function.identity(),
                                (old , newValue) -> newValue.getScore() > old.getScore() ? newValue : old ));
        System.out.println(groupByScore);
    }

}
