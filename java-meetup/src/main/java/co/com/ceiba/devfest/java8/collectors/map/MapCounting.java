package co.com.ceiba.devfest.java8.collectors.map;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by jhon on 13/03/16.
 */
public class MapCounting {

    public static void main (String ... args){
        List<Student> students = DataBase.readTxt();

        Map<Double, Integer> groupByScore =
                students.stream()
                        .collect(Collectors.toMap(
                                Student :: getScore,
                                x -> 1 ,
                                (old, newValue) ->  old +  newValue));
        System.out.println(groupByScore);
    }
}
