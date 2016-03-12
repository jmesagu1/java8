package co.com.ceiba.devfest.java8.stream.interm;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;


public class FlatMapExample {
	
	public static void main(String ... args) {
		List<Student> students = DataBase.readTxt();
		students.stream()
			.flatMap(s -> s.getFirstName().chars().mapToObj(c -> String.valueOf((char) c)))
			.distinct()
			.sorted()
			.forEach(System.out::print);
	}
}
