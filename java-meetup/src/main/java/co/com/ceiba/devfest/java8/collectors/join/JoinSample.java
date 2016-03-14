package co.com.ceiba.devfest.java8.collectors.join;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jhon on 13/03/16.
 */
public class JoinSample {

    public static void main (String ... args){
        List<Student> students = DataBase.readTxt();

        String allDistinctNames =
                students.stream()
                .map(Student :: getFirstName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", ", "ALL NAMES: ", ". THAT IS ALL"));
        System.out.println(allDistinctNames);
    }
}
