package co.com.ceiba.devfest.java8.stream.interm;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class MapExample {

	public static void main(String ... args) {
		List<Student> students = DataBase.readTxt();
		
		students.stream()
			.mapToDouble(s -> s.getScore())
			.distinct()
			.sorted()
			.forEach(System.out::println);
	}
}
